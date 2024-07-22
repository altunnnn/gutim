package com.altun.gutim.entity;

import com.altun.gutim.enums.BlogType;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "blog")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String title;

    private String image;

    private String description;

    private LocalDate date;

    private BlogType blogType;
}
