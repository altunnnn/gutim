package com.altun.gutim.service;

import com.altun.gutim.dto.request.TrainerRequestDto;
import com.altun.gutim.dto.response.TrainerResponseDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TrainerService {
    TrainerResponseDto create(TrainerRequestDto trainerRequestDto);

    Page<TrainerResponseDto> getAllTrainer(Pageable pageable);

    TrainerResponseDto updateTrainer(Long id, TrainerRequestDto tra);

    void deleteClass(Long id);
}
