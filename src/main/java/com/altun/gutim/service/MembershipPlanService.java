package com.altun.gutim.service;

import com.altun.gutim.dto.request.MembershipPlanRequestDto;
import com.altun.gutim.dto.response.MembershipPlanResponseDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface MembershipPlanService {
    MembershipPlanResponseDto create(MembershipPlanRequestDto membershipPlanRequestDto);

    Page<MembershipPlanResponseDto> getAllMembershipPlans(Pageable pageable);

    MembershipPlanResponseDto updateMembershipPlan(Long id, MembershipPlanRequestDto membershipPlanRequestDto);

    void deleteClass(Long id);
}
