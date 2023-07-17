package com.learnSimple.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnSimple.entity.Lesson;
import com.learnSimple.repository.LessonRepository;

@Service
public class StudentServiceImplementation implements StudentService{
	
	@Autowired
	LessonRepository lr;
	
	@Override
	public Lesson findLesson(int lesId) {
		return lr.findById(lesId).get();
	}

}
