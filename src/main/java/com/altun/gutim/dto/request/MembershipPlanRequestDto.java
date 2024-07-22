package com.altun.gutim.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MembershipPlanRequestDto {
    private String name;

    private Integer price;

    private String duration;

    private Integer personalTrainer;

    private Integer amountOfPeople;
}
