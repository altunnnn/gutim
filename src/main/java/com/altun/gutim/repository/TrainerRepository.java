package com.altun.gutim.repository;

import com.altun.gutim.entity.Class;
import com.altun.gutim.entity.Trainer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TrainerRepository extends JpaRepository<Trainer,Long> {
    Page<Trainer> findAllBy(Pageable pageable);
}
