package com.learnSimple.service;

import java.util.List;


import com.learnSimple.entity.Comment;

public interface CommentService {
public List<Comment> commentList();
public String addComment(Comment comment);
}
