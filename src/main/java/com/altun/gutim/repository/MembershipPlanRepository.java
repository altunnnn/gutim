package com.altun.gutim.repository;

import com.altun.gutim.entity.MembershipPlan;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MembershipPlanRepository extends JpaRepository<MembershipPlan,Long> {
    Page<MembershipPlan> findAllBy(Pageable pageable);
}
