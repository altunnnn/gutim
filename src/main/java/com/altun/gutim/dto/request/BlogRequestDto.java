package com.altun.gutim.dto.request;

import com.altun.gutim.enums.BlogType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BlogRequestDto {
    private String title;

    private String description;

    private LocalDate date;

    private BlogType blogType;
}
