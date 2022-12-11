package com.example.mybatispractice.mapper;

import com.example.mybatispractice.domain.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface EmployeeMapper {
    List<Employee> findAllEmployee();
}
