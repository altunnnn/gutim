package com.altun.gutim.mapper;

import com.altun.gutim.dto.request.ClassRequestDto;
import com.altun.gutim.dto.response.ClassResponseDto;
import com.altun.gutim.entity.Class;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface ClassMapper {
    ClassResponseDto toDto(Class clas);

    Class toEntity(ClassRequestDto classRequestDto);

    @Mapping(target = "id", ignore = true)
    void updateClassFromDto(ClassRequestDto classRequestDto, @MappingTarget Class clas);
}
