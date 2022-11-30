package com.example.mybatispractice.repository;

import com.example.mybatispractice.domain.Company;
import com.example.mybatispractice.mapper.CompanyMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class MybatisCompanyRepository implements CompanyRepository{

    private final CompanyMapper companyMapper;
    @Override
    public int save(Company company) {
        return companyMapper.insert(company);
    }

    @Override
    public Optional<Company> findById(int id) {
        return Optional.empty();
    }

    @Override
    public List<Company> findAll() {
        return null;
    }
}
