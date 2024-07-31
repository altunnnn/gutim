package com.altun.gutim.mapper;

import com.altun.gutim.dto.request.AuthRequest;
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
    @Mapping(target = "id", source = "id")
    @Mapping(target = "firstName", source = "firstName")
    @Mapping(target = "lastName", source = "lastName")
    @Mapping(target = "email", source = "email")
    @Mapping(target = "phoneNumber", source = "phoneNumber")
    UserResponseDto toDto(User user);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "firstName", source = "firstName")
    @Mapping(target = "lastName", source = "lastName")
    @Mapping(target = "email", source = "email")
    @Mapping(target = "phoneNumber", source = "phoneNumber")
    User toEntity(UserRequestDto userRequestDto);

    User toEntity(AuthRequest authRequest);

    @Mapping(target = "id", ignore = true)
    void updateClassFromDto(UserRequestDto userRequestDto, @MappingTarget User user);
}
