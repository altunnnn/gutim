package com.altun.gutim.controller;

import com.altun.gutim.dto.request.BlogRequestDto;
import com.altun.gutim.dto.response.BlogResponseDto;
import com.altun.gutim.service.BlogService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/blogs")
@RequiredArgsConstructor
public class BlogController {

    private final BlogService blogService;

    @PostMapping
    public ResponseEntity<BlogResponseDto> createBlog(@RequestBody BlogRequestDto blogRequestDto) {
        BlogResponseDto responseDto = blogService.create(blogRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(responseDto);
    }

    @GetMapping
    public ResponseEntity<Page<BlogResponseDto>> getAllBlogs(Pageable pageable) {
        Page<BlogResponseDto> responseDtoPage = blogService.getAllBlogs(pageable);
        return ResponseEntity.ok(responseDtoPage);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BlogResponseDto> updateBlog(@PathVariable Long id, @RequestBody BlogRequestDto blogRequestDto) {
        BlogResponseDto responseDto = blogService.updateBlog(id, blogRequestDto);
        return ResponseEntity.ok(responseDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBlog(@PathVariable Long id) {
        blogService.deleteClass(id);
        return ResponseEntity.noContent().build();
    }
}
