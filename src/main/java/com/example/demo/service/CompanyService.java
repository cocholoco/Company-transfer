package com.example.demo.service;


import java.util.List;

import com.example.demo.domain.Company;

public interface CompanyService {
    List<Company> getCompaniesAdheredLastMonth();
    Company addCompany(Company company);
}
