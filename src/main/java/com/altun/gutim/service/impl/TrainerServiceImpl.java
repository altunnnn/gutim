package com.altun.gutim.service.impl;

import com.altun.gutim.dto.request.ClassRequestDto;
import com.altun.gutim.dto.request.TrainerRequestDto;
import com.altun.gutim.dto.response.ClassResponseDto;
import com.altun.gutim.dto.response.TrainerResponseDto;
import com.altun.gutim.entity.Class;
import com.altun.gutim.entity.Trainer;
import com.altun.gutim.mapper.TrainerMapper;
import com.altun.gutim.repository.ClassRepository;
import com.altun.gutim.repository.TrainerRepository;
import com.altun.gutim.service.TrainerService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
public class TrainerServiceImpl implements TrainerService {
    private final TrainerMapper trainerMapper;
    private final TrainerRepository trainerRepository;
    private final ClassRepository classRepository;
    @Override
    public TrainerResponseDto create(TrainerRequestDto trainerRequestDto){
        Trainer entity = trainerMapper.toEntity(trainerRequestDto);
        entity.setClasses(classRepository.findAllById(trainerRequestDto.getClassesIds()));
        return trainerMapper.toDto(entity);
    }
    @Override
    public Page<TrainerResponseDto> getAllTrainer(Pageable pageable){
        return trainerRepository.findAllBy(pageable).map(trainerMapper::toDto);
    }

    @Transactional
    @Override
    public TrainerResponseDto updateTrainer(Long id, TrainerRequestDto tra){
        Trainer tr = trainerRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "There is no trainer with this id " + id));
        trainerMapper.updateClassFromDto(tra,tr);
        return trainerMapper.toDto(tr);
    }
    @Override
    public void deleteClass(Long id){
        trainerRepository.deleteById(id);
    }

}
