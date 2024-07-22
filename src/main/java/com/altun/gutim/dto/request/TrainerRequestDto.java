package com.altun.gutim.dto.request;

import com.altun.gutim.entity.Class;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrainerRequestDto {
    private String name;

    private String position;

    private String description;

    private String image;

    private Integer age;

    private List<Long> classesIds;
}
