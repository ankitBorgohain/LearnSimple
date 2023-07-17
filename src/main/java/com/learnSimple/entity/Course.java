package com.learnSimple.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Course {
	
	@Id
	int corId;
	String corName;
	int corPrice;
	@OneToMany
	List<Lesson> lessons;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int corId, String corName, int corPrice, List<Lesson> lessons) {
		super();
		this.corId = corId;
		this.corName = corName;
		this.corPrice = corPrice;
		this.lessons = lessons;
	}
	public int getCorId() {
		return corId;
	}
	public void setCorId(int corId) {
		this.corId = corId;
	}
	public String getCorName() {
		return corName;
	}
	public void setCorName(String corName) {
		this.corName = corName;
	}
	public int getCorPrice() {
		return corPrice;
	}
	public void setCorPrice(int corPrice) {
		this.corPrice = corPrice;
	}
	public List<Lesson> getLessons() {
		return lessons;
	}
	public void setLessons(List<Lesson> lessons) {
		this.lessons = lessons;
	}
	@Override
	public String toString() {
		return "Course [corId=" + corId + ", corName=" + corName + ", corPrice=" + corPrice + ", lessons=" + lessons
				+ "]";
	}
	
}
