package com.altun.gutim.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MembershipPlanResponseDto {
    private Long id;

    private String name;

    private Integer price;

    private String duration;

    private Integer personalTrainer;

    private Integer amountOfPeople;
}
