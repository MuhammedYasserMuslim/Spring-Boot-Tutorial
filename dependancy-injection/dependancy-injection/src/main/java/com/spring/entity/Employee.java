package com.spring.entity;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "employees")
public class Employee extends BaseEntity {

    @Column(name = "name",length = 21,nullable = false)
    private String name;
    @Column(name = "salary")
    private double salary;
    @Column(name = "phone",unique = true,length = 11)
    @JsonProperty(value = "mobile-phone")
    private String phone;

    @ManyToOne
    @JoinColumn(name = "dep_id")
    private Department department;
}
