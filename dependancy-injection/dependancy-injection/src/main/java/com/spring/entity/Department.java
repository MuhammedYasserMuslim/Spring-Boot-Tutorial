package com.spring.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "departments")
public class Department extends BaseEntity {
    @Column(name = "name" ,unique = true,length = 5,nullable = false)
    private String name;

    @JsonIgnore
    @OneToMany(mappedBy = "department")
    Set<Employee> employees = new HashSet<>();
}
