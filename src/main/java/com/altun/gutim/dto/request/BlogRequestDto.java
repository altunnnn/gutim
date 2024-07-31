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

    private Long id;

    @NotNull(message = "Title must not be null")
    private String title;

    @NotNull(message = "Description must not be null")
    private String description;

    @NotNull(message = "Date must not be null")
    private LocalDate date;

    @NotNull(message = "Blogtype must not be null")
    private BlogType blogType;
}
