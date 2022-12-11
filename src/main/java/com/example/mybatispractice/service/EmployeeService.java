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
//
//    public Employee join(Employee employee){
//        return employeeRepository.save(employee);
//    }

    public List<Employee> findAll(){
        return employeeMapper.findAllEmployee();
    }

//    public Optional<Employee> findById(int id){
//        return employeeRepository.findById(id);
//    }

}
