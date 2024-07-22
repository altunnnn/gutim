package com.altun.gutim.dto.response;

import com.altun.gutim.entity.Class;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TrainerResponseDto {
    private Long id;

    private String name;

    private String position;

    private String description;

    private String image;

    private Integer age;

    private List<Class> classes;
}
