package com.learnSimple.service;

import java.util.List;

import com.learnSimple.entity.Course;
import com.learnSimple.entity.Lesson;

public interface TrainerService {
public String addCourse(Course c);
public String addLesson(Lesson l);
public Course getCourse(int corId);
public List<Course> courseList();
}
