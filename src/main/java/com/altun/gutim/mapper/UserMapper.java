package com.altun.gutim.mapper;

import com.altun.gutim.dto.request.ClassRequestDto;
import com.altun.gutim.dto.request.UserRequestDto;
import com.altun.gutim.dto.response.ClassResponseDto;
import com.altun.gutim.dto.response.UserResponseDto;
import com.altun.gutim.entity.Class;
import com.altun.gutim.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserResponseDto toDto(User user);

    User toEntity(UserRequestDto userRequestDto);

    @Mapping(target = "id", ignore = true)
    void updateClassFromDto(UserRequestDto userRequestDto, @MappingTarget User user);
}
