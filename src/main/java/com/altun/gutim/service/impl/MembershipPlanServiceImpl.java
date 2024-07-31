package com.altun.gutim.service.impl;

import com.altun.gutim.dto.request.ClassRequestDto;
import com.altun.gutim.dto.request.MembershipPlanRequestDto;
import com.altun.gutim.dto.response.ClassResponseDto;
import com.altun.gutim.dto.response.MembershipPlanResponseDto;
import com.altun.gutim.entity.Class;
import com.altun.gutim.entity.MembershipPlan;
import com.altun.gutim.mapper.MembershipPlanMapper;
import com.altun.gutim.repository.MembershipPlanRepository;
import com.altun.gutim.service.MembershipPlanService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
public class MembershipPlanServiceImpl implements MembershipPlanService {
    private final MembershipPlanRepository membershipPlanRepository;
    private final MembershipPlanMapper membershipPlanMapper;
    @Override
    public MembershipPlanResponseDto create(MembershipPlanRequestDto membershipPlanRequestDto){
        MembershipPlan membershipPlanMapperEntity = membershipPlanMapper.toEntity(membershipPlanRequestDto);
        membershipPlanRepository.save(membershipPlanMapperEntity);
        return membershipPlanMapper.toDto(membershipPlanMapperEntity);
    }

    @Override
    public Page<MembershipPlanResponseDto> getAllMembershipPlans(Pageable pageable){
        return membershipPlanRepository.findAllBy(pageable).map(membershipPlanMapper::toDto);
    }

    @Transactional
    @Override
    public MembershipPlanResponseDto updateMembershipPlan(Long id, MembershipPlanRequestDto membershipPlanRequestDto){
        MembershipPlan membershipPlan = membershipPlanRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "There is no membership plan with this id " + id));
        membershipPlanMapper.updateClassFromDto(membershipPlanRequestDto,membershipPlan);
        return membershipPlanMapper.toDto(membershipPlan);
    }
    @Override
    public void deleteClass(Long id){
        membershipPlanRepository.deleteById(id);
    }

}
