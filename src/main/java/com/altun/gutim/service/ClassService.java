package com.altun.gutim.service;

import com.altun.gutim.dto.request.ClassRequestDto;
import com.altun.gutim.dto.response.ClassResponseDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ClassService {
    ClassResponseDto create(ClassRequestDto clas);

    Page<ClassResponseDto> getAllClasses(Pageable pageable);

    ClassResponseDto updateClass(Long id, ClassRequestDto classRequestDto);

    void deleteClass(Long id);
}
