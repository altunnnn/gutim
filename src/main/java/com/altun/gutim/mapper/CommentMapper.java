package com.altun.gutim.mapper;

import com.altun.gutim.dto.request.CommentRequestDto;
import com.altun.gutim.entity.Comment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CommentMapper {

    Comment toEntity(CommentRequestDto commentRequestDto);

}
