package com.learnSimple.controller;

import java.util.EventListener;
import java.util.List;

import com.learnSimple.entity.Comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.learnSimple.entity.User;
import com.learnSimple.service.CommentService;
import com.learnSimple.service.UserService;

@Controller
public class ServiceController {
	@Autowired
	UserService us;
	 


	@PostMapping(value="/registerUser")
	public String registerUser(@RequestParam("firstname") String firstname,
								@RequestParam("lastname") String lastname,
								@RequestParam("email") String email,
								@RequestParam("password") String password, 
								@RequestParam("role") String role,
								@RequestParam("mobile") String mobile,
								@RequestParam("dob") String dob ) {
		boolean emailExists=us.checkEmail(email);
		if(emailExists==false) {
		User user =new User();
		user.setFirstname(firstname);
		user.setLastname(lastname);
		user.setEmail(email);
		user.setPassword(password);
		user.setRole(role);
		user.setMobile(mobile);
		user.setDob(dob);
		us.registerUser(user);
		System.out.println("User added successfully");
		return "redirect:/";
			}else {
				System.out.println("User already present!");
				return "redirect:/login";
			}
		
		}
	
	@PostMapping("/validate")
	public String validate( @RequestParam("email")String email, 
							@RequestParam("password")String password ) {

			if(us.checkEmail(email)==true) {
				boolean v=us.valid(email,password);
				if(us.valid(email,password)==true) {
							if(us.getRole(email).equals("student")) 
									{
										return "redirect:/stdHome";
										
										}
										else{
											return "redirect:/trnHome";
										}
				}
				else {
					System.err.println("Something went wrong ! Try again your email and password");
					return "/login";
				}
			}
			else {
				System.out.println("Email does not exist");
				return "redirect:/login";
			}
		
	}
	@Autowired
	CommentService comService;
	@PostMapping("/addComment")
	public String comments(@RequestParam("comment")String comment, Model model) {
		Comment com=new Comment();
		com.setComment(comment);
		comService.addComment(com);
		List<Comment> commentList=comService.commentList();
		model.addAttribute("comment", commentList);
		return "redirect:/";
	}
	
	
	
	
}
