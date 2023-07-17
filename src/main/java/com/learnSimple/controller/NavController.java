package com.learnSimple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.learnSimple.entity.User;
import com.learnSimple.service.UserService;
	
@Controller
public class NavController {
	
	

	@GetMapping(value="/")
	public String index() {
		return "index";
	}
	
	@GetMapping(value="/register")
	public String register() {
		return "register";
	}

	@GetMapping(value="/login")
	public String login() {
		return "login";
	}
	@GetMapping(value="/dash")
	public String dash() {
		return "dash";
	}
	@GetMapping(value="/stdHome")
	public String stdhome() {
		return "studentHome";
	}
	@GetMapping(value="/trnHome")
	public String trnhome() {
		return "trainerHome";
	}
	@GetMapping(value="/createCourse")
	public String createCourse() {
		return "createCourse";
	}
	@GetMapping(value="/addLesson")
	public String addLesson() {
		return "addLesson";
	}
	@GetMapping(value="/courses")
	public String courses() {
		return "courses";
	}
	@GetMapping(value="/purchase")
	public String purchase() {
		return "purchase";
	}
	@GetMapping(value="/myCourses")
	public String myCourses() {
		return "myCourses";
	}
	@GetMapping(value="/selectLesson")
	public String demoLesson() {
		return "demoLesson";
	}
	@GetMapping(value="/new")
	public String nw() {
		return "new";
	}
	
	
	
	
}
