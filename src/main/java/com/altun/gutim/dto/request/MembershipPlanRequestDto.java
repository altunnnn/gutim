package com.altun.gutim.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MembershipPlanRequestDto {

    private Long id;

    @NotNull(message = "name must not be null")
    private String name;

    @NotNull(message = "Price must not be null")
    @Positive
    private Integer price;

    @NotNull(message = "Duration must not be null")
    private String duration;

    @NotNull(message = "PersonalTrainer must not be null")
    private Integer personalTrainer;

    @NotNull(message = "People number must not be null")
    private Integer amountOfPeople;
}
