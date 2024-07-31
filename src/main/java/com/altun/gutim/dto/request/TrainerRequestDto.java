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


    private Long id;

    @NotNull(message = "Name must not be null")
    private String name;

    @NotNull(message = "Position must not be null")
    private String position;

    @NotNull(message = "Description must not be null")
    private String description;

    @NotNull(message = "Image must not be null")
    private String image;

    @NotNull(message = "Age must not be null")
    @Positive
    private Integer age;

    private List<Long> classesIds;
}
