package com.altun.gutim.service.impl;

import com.altun.gutim.dto.request.ClassRequestDto;
import com.altun.gutim.dto.response.ClassResponseDto;
import com.altun.gutim.entity.Class;
import com.altun.gutim.mapper.ClassMapper;
import com.altun.gutim.repository.ClassRepository;
import com.altun.gutim.repository.TrainerRepository;
import com.altun.gutim.service.ClassService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
public class ClassServiceImpl implements ClassService {
    private final ClassRepository classRepository;
    private final ClassMapper classMapper;
    private final TrainerRepository trainerRepository;
    @Override
    public ClassResponseDto create(ClassRequestDto clas){
        Class classEntity = classMapper.toEntity(clas);
        classEntity.setTrainer(trainerRepository.findById(clas.getTrainerId()).get());
        return classMapper.toDto(classEntity);
    }
    @Override
    public Page<ClassResponseDto> getAllClasses(Pageable pageable){
        return classRepository.findAllBy(pageable).map(classMapper::toDto);
    }

    @Transactional
    @Override
    public ClassResponseDto updateClass(Long id, ClassRequestDto classRequestDto){
        Class aClass = classRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "There is no class with this id " + id));
        classMapper.updateClassFromDto(classRequestDto,aClass);
        return classMapper.toDto(aClass);
    }
    @Override
    public void deleteClass(Long id){
        classRepository.deleteById(id);
    }

}
