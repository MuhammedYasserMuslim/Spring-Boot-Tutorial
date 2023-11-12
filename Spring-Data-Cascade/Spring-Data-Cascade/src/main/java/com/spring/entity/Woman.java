package com.spring.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "woman")
@Builder
public class Woman {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "salary")
    private double Salary;

    @Column(name = "age")
    private int age;

    @OneToOne(mappedBy = "woman", cascade = CascadeType.REMOVE,fetch = FetchType.LAZY)
    @JsonIgnore
    private Man man;

    @Transient
    private Long numOfChildren;

    @OneToMany(mappedBy = "woman", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE, CascadeType.REFRESH})
    @JsonIgnore
    Set<Child> children = new HashSet<>();

    @PostLoad
    private void sumChildren(){
        this.setNumOfChildren(2L);
    }
}
