package com.altun.gutim.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "trainer")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Trainer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;

    private String position;

    private String description;

    private String image;

    private Integer age;

    @OneToMany(mappedBy = "trainer")
    @JsonIgnore
    private List<Class> classes;


}
