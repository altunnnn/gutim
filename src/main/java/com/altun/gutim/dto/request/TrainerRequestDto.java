package com.altun.gutim.dto.request;

import com.altun.gutim.entity.Class;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrainerRequestDto {

    @NotNull(message = "Trainer id must not be null")
    @Positive(message = "Trainer ID must be a positive number")
    private Long id;

    private String name;

    private String position;

    private String description;

    private String image;

    private Integer age;

    private List<Long> classesIds;
}
