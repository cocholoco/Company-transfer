package com.example.demo.infrastructure.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Transfer;
import java.time.LocalDate;
import java.util.List;

public interface TransferRepository extends JpaRepository<Transfer, Long> {
    List<Transfer> findByFechaTransferenciaAfter(LocalDate date);
}