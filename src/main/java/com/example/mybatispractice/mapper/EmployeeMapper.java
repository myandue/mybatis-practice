package com.example.mybatispractice.mapper;

import com.example.mybatispractice.domain.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface EmployeeMapper {

    void insert(Employee employee);
    List<Employee> getEmployee();
    List<Employee> getEmployee(int id);

}
