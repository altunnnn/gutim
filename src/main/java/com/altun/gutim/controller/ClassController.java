package com.altun.gutim.controller;

import com.altun.gutim.dto.request.ClassRequestDto;
import com.altun.gutim.dto.response.ClassResponseDto;
import com.altun.gutim.service.ClassService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/classes")
@RequiredArgsConstructor
public class ClassController {

    private final ClassService classService;

    @PostMapping
    public ResponseEntity<ClassResponseDto> createClass(@RequestBody ClassRequestDto classRequestDto) {
        ClassResponseDto responseDto = classService.create(classRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(responseDto);
    }

    @GetMapping
    public ResponseEntity<Page<ClassResponseDto>> getAllClasses(Pageable pageable) {
        Page<ClassResponseDto> responseDtoPage = classService.getAllClasses(pageable);
        return ResponseEntity.ok(responseDtoPage);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ClassResponseDto> updateClass(@PathVariable Long id, @RequestBody ClassRequestDto classRequestDto) {
        ClassResponseDto responseDto = classService.updateClass(id, classRequestDto);
        return ResponseEntity.ok(responseDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClass(@PathVariable Long id) {
        classService.deleteClass(id);
        return ResponseEntity.noContent().build();
    }
}
