package com.altun.gutim.dto.response;

import com.altun.gutim.enums.BlogType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BlogResponseDto {
    private Long id;

    private String title;

    private String image;

    private String description;

    private LocalDate date;

    private BlogType blogType;
}
