package com.learnSimple.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.learnSimple.entity.Course;
import com.learnSimple.entity.Lesson;
import com.learnSimple.service.TrainerServiceImplementation;

@Controller
public class TrainerController {
	
@Autowired
TrainerServiceImplementation serv;



	@PostMapping("/addCourse")
	public String addCourse(@RequestParam("corId") int corId,
							@RequestParam("corName") String corName ,
							@RequestParam("corPrice") int corPrice) {
		Course c=new Course();
		c.setCorId(corId);
		c.setCorName(corName);
		c.setCorPrice(corPrice);
		
		serv.addCourse(c);
		return "redirect:/";
	}
	@PostMapping("/lesson")
	public String lesson(@RequestParam("corId") int corId,
						 @RequestParam("lesId") int lesId,
						 @RequestParam("lesName") String lesName,
						 @RequestParam("lesTopics") String lesTopics,
						 @RequestParam("link")String link) {
		Course course=serv.getCourse(corId);
		Lesson l=new Lesson( lesId, lesName, lesTopics, link, course);
		serv.addLesson(l);
		course.getLessons().add(l);
		
		
		return "redirect:/";
	}
	@GetMapping("/showCourses")
	public String showCourses(Model model) {
		List<Course> courseList=serv.courseList();
		model.addAttribute("courseList",courseList);
		// System.out.println(courseList);
		return "courses";
	}
}
