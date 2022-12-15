package com.example.mybatispractice.service;

import com.example.mybatispractice.domain.Company;
import com.example.mybatispractice.mapper.CompanyMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyMapper companyMapper;

    public Company join(Company company){
        companyMapper.insert(company);
        return company;
    }

    public List<Company> findAllCompany(){
        return companyMapper.getCompany();
    }

    public Company findCompanyById(int id){
        return companyMapper.getCompany(id);
    }
}
