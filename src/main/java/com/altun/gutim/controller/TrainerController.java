package com.altun.gutim.controller;

import com.altun.gutim.dto.request.TrainerRequestDto;
import com.altun.gutim.dto.response.TrainerResponseDto;
import com.altun.gutim.service.TrainerService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/trainers")
@RequiredArgsConstructor
public class TrainerController {

    private final TrainerService trainerService;

    @PostMapping
    public ResponseEntity<TrainerResponseDto> createTrainer(@RequestBody TrainerRequestDto trainerRequestDto) {
        TrainerResponseDto responseDto = trainerService.create(trainerRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(responseDto);
    }

    @GetMapping
    public ResponseEntity<Page<TrainerResponseDto>> getAllTrainers(Pageable pageable) {
        Page<TrainerResponseDto> responseDtoPage = trainerService.getAllTrainer(pageable);
        return ResponseEntity.ok(responseDtoPage);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TrainerResponseDto> updateTrainer(@PathVariable Long id, @RequestBody TrainerRequestDto trainerRequestDto) {
        TrainerResponseDto responseDto = trainerService.updateTrainer(id, trainerRequestDto);
        return ResponseEntity.ok(responseDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTrainer(@PathVariable Long id) {
        trainerService.deleteClass(id);
        return ResponseEntity.noContent().build();
    }
}
