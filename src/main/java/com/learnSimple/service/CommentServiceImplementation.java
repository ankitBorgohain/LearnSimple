package com.learnSimple.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnSimple.entity.Comment;
import com.learnSimple.repository.CommentRepository;
@Service
public class CommentServiceImplementation implements CommentService {
	@Autowired
CommentRepository comRepo;

	@Override
	public List<Comment> commentList() {
		
		return comRepo.findAll();
	}

	@Override
	public String addComment(Comment comment) {
		comRepo.save(comment);
		return "comment added";
	}

}
