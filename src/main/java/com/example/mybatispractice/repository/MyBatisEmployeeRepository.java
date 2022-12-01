package com.example.mybatispractice.repository;

import com.example.mybatispractice.domain.Employee;
import com.example.mybatispractice.mapper.EmployeeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class MyBatisEmployeeRepository implements EmployeeRepository{

    private final EmployeeMapper employeeMapper;

    @Override
    public Employee save(Employee employee) {
        employeeMapper.insert(employee);
        return employee;
    }

    @Override
    public List<Employee> findAll() {
        return employeeMapper.getAll();
    }

    @Override
    public Optional<Employee> findById(int id) {
        return employeeMapper.getById(id);
    }
}
