package com.example.mybatispractice.controller;

import com.example.mybatispractice.domain.Employee;
import com.example.mybatispractice.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping("")
    public Employee postEmployee(@RequestBody Employee employee) {
        return employeeService.join(employee);
    }

    @GetMapping("")
    public List<Employee> findAllEmployee() {
        return employeeService.findAll();
    }

    @GetMapping("/{id}")
    public Employee findEmployeeById(@PathVariable("id") int id) {
        return employeeService.findEmployeeById(id);
    }
}
