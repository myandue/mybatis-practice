package com.example.mybatispractice.controller;

import com.example.mybatispractice.domain.Company;
import com.example.mybatispractice.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/company")
public class CompanyController {

    private final CompanyService companyService;

    @PostMapping("")
    public Company postCompany(@RequestBody Company company){
        return companyService.join(company);
    }

    @GetMapping("")
    public List<Company> getAllCompany() {
        return companyService.findAllCompany();
    }

    @GetMapping("/{id}")
    public Company getCompanyById(@PathVariable("id") int id){
        return companyService.findCompanyById(id);
    }
}
