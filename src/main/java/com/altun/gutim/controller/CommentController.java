package com.altun.gutim.controller;

import com.altun.gutim.dto.request.CommentRequestDto;
import com.altun.gutim.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comment")
@RequiredArgsConstructor
public class CommentController {

    private final CommentService commentService;

    @PostMapping()
    public ResponseEntity<String> sendComment(@RequestBody CommentRequestDto commentRequestDto){
        commentService.sendComment(commentRequestDto);
        return ResponseEntity.ok("Commend send successfully!");
    }

}
