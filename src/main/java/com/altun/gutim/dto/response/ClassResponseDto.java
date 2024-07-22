package com.altun.gutim.dto.response;

import com.altun.gutim.entity.Trainer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClassResponseDto {
    private Long id;

    private String title;

    private String image;

    private LocalDate date;

    private Trainer trainer;
}
