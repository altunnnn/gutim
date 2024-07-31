package com.altun.gutim.service.impl;

import com.altun.gutim.dto.request.CommentRequestDto;
import com.altun.gutim.entity.Comment;
import com.altun.gutim.mapper.CommentMapper;
import com.altun.gutim.repository.CommentRepository;
import com.altun.gutim.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService {
    private final CommentRepository commentRepository;
    private final CommentMapper commentMapper;
    @Override
    public void sendComment(CommentRequestDto commentRequestDto) {
        Comment comment = commentMapper.toEntity(commentRequestDto);
        commentRepository.save(comment);
    }
}
