package com.learnSimple.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
@Entity
public class Lesson {
	@Id
	int lesId;
	String lesName;
	String topics;
	String link;
	@ManyToOne
	Course course;
	public Lesson() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Lesson(int lesId, String lesName, String  topics, String link, Course course) {
		super();
		this.lesId = lesId;
		this.lesName = lesName;
		this.topics = topics;
		this.link = link;
		this.course = course;
	}
	public int getLesId() {
		return lesId;
	}
	public void setLesId(int lesId) {
		this.lesId = lesId;
	}
	public String getLesName() {
		return lesName;
	}
	public void setLesName(String lesName) {
		this.lesName = lesName;
	}
	public String getTopics() {
		return topics;
	}
	public void setTopics(String topics) {
		this.topics = topics;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Lesson [lesId=" + lesId + ", lesName=" + lesName + ", topics=" + topics + ", link=" + link + ", course="
				+ course + "]";
	}
	
}
