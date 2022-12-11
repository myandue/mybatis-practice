package com.example.mybatispractice.service;

import com.example.mybatispractice.domain.Company;
import com.example.mybatispractice.mapper.CompanyMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyMapper companyMapper;

//    public Company join(Company company){
//        return companyMapper.save(company);
//    }

//    public List<HashMap<Object,Object>> findAll(HashMap<Object, Object> vo){
//
//        return companyMapper.findAll(vo);
//    }

    public List<Company> findAll(){
        return companyMapper.findAllCompany();
    }
}
