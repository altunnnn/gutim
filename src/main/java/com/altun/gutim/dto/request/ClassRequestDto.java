package com.altun.gutim.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassRequestDto {
    @NotNull
    private String title;

    @NotNull
    private LocalDate date;

    @NotNull
    private Long trainerId;


}
