package com.example.mybatispractice.repository;

import com.example.mybatispractice.domain.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository {
    Employee save(Employee employee);
    List<Employee> findAll();
    Optional<Employee> findById(int id);
}
