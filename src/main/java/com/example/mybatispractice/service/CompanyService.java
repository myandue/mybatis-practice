package com.example.mybatispractice.service;

import com.example.mybatispractice.domain.Company;
import com.example.mybatispractice.repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyRepository companyRepository;

    public Company join(Company company){
        return companyRepository.save(company);
    }

    public List<Company> findAll(){

        return companyRepository.findAll();
    }

    public Optional<Company> findById(int id){
        return companyRepository.findById(id);
    }
}
