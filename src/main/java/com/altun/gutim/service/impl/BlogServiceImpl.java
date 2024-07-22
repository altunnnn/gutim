package com.altun.gutim.service.impl;

import com.altun.gutim.dto.request.BlogRequestDto;
import com.altun.gutim.dto.request.ClassRequestDto;
import com.altun.gutim.dto.response.BlogResponseDto;
import com.altun.gutim.dto.response.ClassResponseDto;
import com.altun.gutim.entity.Blog;
import com.altun.gutim.entity.Class;
import com.altun.gutim.mapper.BlogMapper;
import com.altun.gutim.repository.BlogRepository;
import com.altun.gutim.service.BlogService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
public class BlogServiceImpl implements BlogService {
    private final BlogRepository blogRepository;
    private final BlogMapper blogMapper;

    @Override
    public BlogResponseDto create(BlogRequestDto blogRequestDto){
        Blog blogEntity = blogMapper.toEntity(blogRequestDto);
        return blogMapper.toDto(blogEntity);
    }
    @Override
    public Page<BlogResponseDto> getAllBlogs(Pageable pageable){
        return blogRepository.findAllBy(pageable).map(blogMapper::toDto);
    }

    @Transactional
    @Override
    public BlogResponseDto updateBlog(Long id, BlogRequestDto blogRequestDto){
        Blog blogEntity = blogRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "There is no blog with this id " + id));
        blogMapper.updateClassFromDto(blogRequestDto,blogEntity);
        return blogMapper.toDto(blogEntity);
    }
    @Override
    public void deleteClass(Long id){
        blogRepository.deleteById(id);
    }
}
