package com.learnSimple.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnSimple.entity.Lesson;

public interface LessonRepository extends JpaRepository<Lesson, Integer> {

}
