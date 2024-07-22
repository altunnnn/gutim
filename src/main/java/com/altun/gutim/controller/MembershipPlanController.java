package com.altun.gutim.controller;

import com.altun.gutim.dto.request.MembershipPlanRequestDto;
import com.altun.gutim.dto.response.MembershipPlanResponseDto;
import com.altun.gutim.service.MembershipPlanService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/membership-plans")
@RequiredArgsConstructor
public class MembershipPlanController {

    private final MembershipPlanService membershipPlanService;

    @PostMapping
    public ResponseEntity<MembershipPlanResponseDto> createMembershipPlan(@RequestBody MembershipPlanRequestDto membershipPlanRequestDto) {
        MembershipPlanResponseDto responseDto = membershipPlanService.create(membershipPlanRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(responseDto);
    }

    @GetMapping
    public ResponseEntity<Page<MembershipPlanResponseDto>> getAllMembershipPlans(Pageable pageable) {
        Page<MembershipPlanResponseDto> responseDtoPage = membershipPlanService.getAllMembershipPlans(pageable);
        return ResponseEntity.ok(responseDtoPage);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MembershipPlanResponseDto> updateMembershipPlan(@PathVariable Long id, @RequestBody MembershipPlanRequestDto membershipPlanRequestDto) {
        MembershipPlanResponseDto responseDto = membershipPlanService.updateMembershipPlan(id, membershipPlanRequestDto);
        return ResponseEntity.ok(responseDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMembershipPlan(@PathVariable Long id) {
        membershipPlanService.deleteClass(id);
        return ResponseEntity.noContent().build();
    }
}
