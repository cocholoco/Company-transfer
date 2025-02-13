package com.example.demo.infrastructure.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.domain.Company;
import com.example.demo.service.CompanyService;

import java.util.List;

@RestController
@RequestMapping("/api/companies")
public class CompanyController {
    private final CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping("/adhered-last-month")
    public ResponseEntity<List<Company>> getAdheredCompaniesLastMonth() {
        return ResponseEntity.ok(companyService.getCompaniesAdheredLastMonth());
    }

    @PostMapping
    public ResponseEntity<Company> addCompany(@RequestBody Company company) {
        return ResponseEntity.ok(companyService.addCompany(company));
    }
}
