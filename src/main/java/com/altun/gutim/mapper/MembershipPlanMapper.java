package com.altun.gutim.mapper;

import com.altun.gutim.dto.request.ClassRequestDto;
import com.altun.gutim.dto.request.MembershipPlanRequestDto;
import com.altun.gutim.dto.response.ClassResponseDto;
import com.altun.gutim.dto.response.MembershipPlanResponseDto;
import com.altun.gutim.entity.Class;
import com.altun.gutim.entity.MembershipPlan;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface MembershipPlanMapper {
    MembershipPlanResponseDto toDto(MembershipPlan membershipPlan);

    MembershipPlan toEntity(MembershipPlanRequestDto membershipPlanRequestDto);

    @Mapping(target = "id", ignore = true)
    void updateClassFromDto(MembershipPlanRequestDto membershipPlanRequestDto, @MappingTarget MembershipPlan membershipPlan);
}
