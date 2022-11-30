package com.example.mybatispractice.mapper;

import com.example.mybatispractice.domain.Company;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CompanyMapper {

    @Select("INSERT INTO company(company_name, company_address) VALUES(#{company.name}, #{company.address})")
    int insert(@Param("company") Company company);
}
