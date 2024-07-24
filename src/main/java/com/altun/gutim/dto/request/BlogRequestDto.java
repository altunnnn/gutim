package com.altun.gutim.dto.request;

import com.altun.gutim.enums.BlogType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BlogRequestDto {

    @NotNull(message = "Blog id must not be null")
    @Positive(message = "Blog ID must be a positive number")
    private Long id;

    private String title;

    private String description;

    private LocalDate date;

    private BlogType blogType;
}
