package com.example.mybatispractice.controller;

import com.example.mybatispractice.domain.Company;
import com.example.mybatispractice.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/company")
public class CompanyController {

    private final CompanyService companyService;

    @PostMapping("")
    public int postCompany(@RequestBody Company company){
        return companyService.join(company);
    }
}
