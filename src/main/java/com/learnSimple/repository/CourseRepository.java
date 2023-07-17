package com.learnSimple.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.learnSimple.entity.Course;
public interface CourseRepository extends JpaRepository<Course, Integer>{

}
