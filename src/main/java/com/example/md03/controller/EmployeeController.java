package com.example.md03.controller;

import com.example.md03.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    @GetMapping
    public List<Employee> getAll() {
        return List.of(
                new Employee(1L, "Nguyễn Văn A", 5000.0),
                new Employee(2L, "Trần Văn B", 4500.0),
                new Employee(3L, "Trần Thị C", 4000.0)
        );
    }
}