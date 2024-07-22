package com.altun.gutim.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "membership_plan")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class MembershipPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;

    private Integer price;

    private String duration;

    private Integer personalTrainer;

    private Integer amountOfPeople;
}
