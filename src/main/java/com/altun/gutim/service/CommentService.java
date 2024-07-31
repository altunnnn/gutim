package com.altun.gutim.service;

import com.altun.gutim.dto.request.CommentRequestDto;

public interface CommentService {
    void sendComment(CommentRequestDto commentRequestDto);
}
