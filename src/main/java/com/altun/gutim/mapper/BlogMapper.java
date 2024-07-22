package com.altun.gutim.mapper;

import com.altun.gutim.dto.request.BlogRequestDto;
import com.altun.gutim.dto.request.ClassRequestDto;
import com.altun.gutim.dto.response.BlogResponseDto;

import com.altun.gutim.entity.Blog;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface BlogMapper {
    BlogResponseDto toDto(Blog blog);

    Blog toEntity(BlogRequestDto blogRequestDto);

    @Mapping(target = "id", ignore = true)
    void updateClassFromDto(BlogRequestDto blogRequestDto, @MappingTarget Blog blog);
}
