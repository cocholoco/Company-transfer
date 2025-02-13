package com.example.demo.service.impl;


import org.springframework.stereotype.Service;

import com.example.demo.domain.Company;
import com.example.demo.infrastructure.repository.CompanyRepository;
import com.example.demo.service.CompanyService;
import java.time.LocalDate;
import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {
    private final CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public List<Company> getCompaniesAdheredLastMonth() {
        LocalDate oneMonthAgo = LocalDate.now().minusMonths(1);
        return companyRepository.findByFechaAdhesionAfter(oneMonthAgo);
    }

    @Override
    public Company addCompany(Company company) {
        company.setFechaAdhesion(LocalDate.now());
        return companyRepository.save(company);
    }
}
