package com.altun.gutim.mapper;

import com.altun.gutim.dto.request.ClassRequestDto;
import com.altun.gutim.dto.request.TrainerRequestDto;
import com.altun.gutim.dto.response.ClassResponseDto;
import com.altun.gutim.dto.response.TrainerResponseDto;
import com.altun.gutim.entity.Class;
import com.altun.gutim.entity.Trainer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface TrainerMapper {
    TrainerResponseDto toDto(Trainer trainer);

    Trainer toEntity(TrainerRequestDto trainerRequestDto);

    @Mapping(target = "id", ignore = true)
    void updateClassFromDto(TrainerRequestDto trainerRequestDto, @MappingTarget Trainer trainer);
}
