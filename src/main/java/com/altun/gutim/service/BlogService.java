package com.altun.gutim.service;

import com.altun.gutim.dto.request.BlogRequestDto;
import com.altun.gutim.dto.response.BlogResponseDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BlogService {

    BlogResponseDto create(BlogRequestDto blogRequestDto);

    Page<BlogResponseDto> getAllBlogs(Pageable pageable);

    BlogResponseDto updateBlog(Long id, BlogRequestDto blogRequestDto);

    void deleteClass(Long id);
}
