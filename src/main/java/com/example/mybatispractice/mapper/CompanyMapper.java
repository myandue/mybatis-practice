package com.example.mybatispractice.mapper;

import com.example.mybatispractice.domain.Company;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface CompanyMapper {

    List<Company> findAllCompany();
}
