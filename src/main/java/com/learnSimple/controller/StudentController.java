package com.learnSimple.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.learnSimple.entity.Lesson;
import com.learnSimple.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	StudentService service;
	@PostMapping("/goToLesson")
	public String myLesson(@RequestParam("lesId")int lesId, Model model) {
		Lesson lesson=service.findLesson(lesId);
		model.addAttribute("lesson", lesson);
		System.out.println(lesson);
		return "myLesson";
	}
	

}
