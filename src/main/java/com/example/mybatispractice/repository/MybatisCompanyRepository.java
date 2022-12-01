package com.example.mybatispractice.repository;

import com.example.mybatispractice.domain.Company;
import com.example.mybatispractice.mapper.CompanyMapper;
import com.example.mybatispractice.mapper.EmployeeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class MybatisCompanyRepository implements CompanyRepository{

    private final CompanyMapper companyMapper;
    private final EmployeeMapper employeeMapper;

    @Override
    public Company save(Company company) {
        companyMapper.insert(company);
        return company;
    }

    @Override
    public List<Company> findAll() {
        List<Company> companyList = companyMapper.getAll();
//        if(companyList != null && companyList.size()>0){
//            for(Company company : companyList){
//                company.setEmployeeList(employeeMapper.getByCompanyId(company.getId()));
//            }
//        }
        return companyList;
    }

    @Override
    public Optional<Company> findById(int id) {
        return companyMapper.getById(id);
    }
}
