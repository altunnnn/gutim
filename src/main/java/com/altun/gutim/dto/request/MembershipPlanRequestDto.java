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

    @NotNull(message = "Membership Plan id must not be null")
    @Positive(message = "Membership Plan ID must be a positive number")
    private Long id;

    private String name;

    private Integer price;

    private String duration;

    private Integer personalTrainer;

    private Integer amountOfPeople;
}
