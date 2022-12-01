package com.example.mybatispractice.mapper;

import com.example.mybatispractice.domain.Company;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Optional;

@Mapper
public interface CompanyMapper {

    @Insert("INSERT INTO company(company_name, company_address) VALUES(#{company.name}, #{company.address})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    //생성된 key를 자바 객체 company key property인 id에 넣어준다.
    //insert 메서드를 사용한곳에서 company를 반환해주면, id 값이 생성된채로 반환된다.
    int insert(@Param("company") Company company);

    @Select("SELECT * FROM company")
    @Results(id="CompanyMap", value={
            @Result(property="name", column = "company_name"),
            @Result(property="address", column = "company_address"),
            @Result(property = "employeeList", column = "id", many = @Many(select="com.example.mybatispractice.mapper.EmployeeMapper.getByCompanyId"))
    })
    List<Company> getAll();

    @Select("SELECT * FROM company WHERE id=#{id}")
    @ResultMap("CompanyMap")
    Optional<Company> getById(@Param("id") int id);
}
