package com.example.demo.infrastructure.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Company;
import java.time.LocalDate;
import java.util.List;

public interface CompanyRepository extends JpaRepository<Company, Long> {
    List<Company> findByFechaAdhesionAfter(LocalDate date);
}
