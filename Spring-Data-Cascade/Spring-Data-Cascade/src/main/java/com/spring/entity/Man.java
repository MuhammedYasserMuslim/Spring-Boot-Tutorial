package com.spring.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Formula;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "man")
@Builder
public class Man {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "salary")
    private double Salary;

    @Column(name = "age")
    private int age;

    @Formula("(SELECT count(*) FROM cas.man inner join children   on man.id=children.father_id    where man.id =id)")
    private Long numOfChildren;

    @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH},fetch = FetchType.EAGER)
    @JoinColumn(name = "Wife_id")
    private Woman woman;

    @OneToMany(mappedBy = "man", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE, CascadeType.REFRESH} )
    @JsonIgnore
    Set<Child> children = new HashSet<>();
}
