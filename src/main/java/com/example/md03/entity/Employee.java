package com.example.md03.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class Employee {
    private Long id;
    private String fullName;
    private Double salary;
}