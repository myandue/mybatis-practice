package com.example.mybatispractice.service;

import com.example.mybatispractice.domain.Employee;
import com.example.mybatispractice.mapper.EmployeeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeService {
//    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    public Employee join(Employee employee){
        employeeMapper.insert(employee);
        return employee;
    }

    public List<Employee> findAll(){
        return employeeMapper.getEmployee();
    }

    public Employee findEmployeeById(int id){
        return employeeMapper.getEmployee(id).get(0);
    }

}
