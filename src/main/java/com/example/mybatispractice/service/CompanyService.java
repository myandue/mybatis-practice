package com.example.mybatispractice.service;

import com.example.mybatispractice.domain.Company;
import com.example.mybatispractice.repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyRepository companyRepository;

    public int join(Company company){
        return companyRepository.save(company);
    }
}
