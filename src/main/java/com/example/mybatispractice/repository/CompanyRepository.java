package com.example.mybatispractice.repository;

import com.example.mybatispractice.domain.Company;

import java.util.List;
import java.util.Optional;

public interface CompanyRepository {

    Company save(Company company);
    List<Company> findAll();
    Optional<Company> findById(int id);

}
