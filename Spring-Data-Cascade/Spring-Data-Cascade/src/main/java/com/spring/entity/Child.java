package com.spring.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "children")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Child {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @ManyToOne
    @JoinColumn(name = "father_id")
    private Man man;

    @ManyToOne
    @JoinColumn(name = "mother_id")
    private Woman woman;

}
