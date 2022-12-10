package com.example.mybatispractice.mapper;

import com.example.mybatispractice.domain.Company;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
@Mapper
public interface CompanyMapper {

    List<Company> findAll();
}
