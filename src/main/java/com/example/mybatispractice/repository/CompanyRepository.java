package com.example.mybatispractice.repository;

import com.example.mybatispractice.domain.Company;

import java.util.List;
import java.util.Optional;

public interface CompanyRepository {

    int save(Company company);
    Optional<Company> findById(int id);
    List<Company> findAll();
}
