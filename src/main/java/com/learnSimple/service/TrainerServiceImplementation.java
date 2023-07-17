package com.learnSimple.service;

import com.learnSimple.repository.CourseRepository;
import com.learnSimple.repository.LessonRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnSimple.entity.Course;
import com.learnSimple.entity.Lesson;

@Service
public class TrainerServiceImplementation implements TrainerService {
	@Autowired
	CourseRepository courseRepo;
	
	@Autowired
	LessonRepository lessonRepo;
	
	
	@Override
	public String addCourse(Course c) {
		courseRepo.save(c);
		System.out.println("course added");
		return "course added";
		
	}


	@Override
	public String addLesson(Lesson l) {
		lessonRepo.save(l);
		System.out.println("Lesson added successfully");
		return "Lesson added";
	}
	@Override
	public Course getCourse(int corId){
		return courseRepo.findById(corId).get();
	}


	@Override
	public List<Course> courseList() {
		return courseRepo.findAll();
		
	}

}
