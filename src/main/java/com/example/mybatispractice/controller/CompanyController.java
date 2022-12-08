package com.example.mybatispractice.controller;

import com.example.mybatispractice.domain.Company;
import com.example.mybatispractice.service.CompanyService;
import lombok.RequiredArgsConstructor;
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

//    @PostMapping("")
//    public Company postCompany(@RequestBody Company company){
//        return companyService.join(company);
//    }

    @GetMapping("")
    public void getAllCompany() {
        HashMap<Object, Object> parameterMap = new HashMap<Object, Object>();
        //parameterMap.put("region", "서울");

        List<HashMap<Object, Object>> selectList = companyService.findAll(parameterMap);

        for (HashMap<Object, Object> rowMap : selectList) {
            for (Map.Entry<Object, Object> rowEntry : rowMap.entrySet()) {
                Object key = rowEntry.getKey();
                Object value = rowEntry.getValue();
                System.out.print(String.format(key + ":" + value + "  "));

            }
            //return companyService.findAll();
        }
    }

//    @GetMapping("/{id}")
//    public Optional<Company> findCompanyById(@PathVariable("id") int id){
//        return companyService.findById(id);
//    }
}
