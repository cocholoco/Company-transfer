package com.example.demo.service.impl;


import org.springframework.stereotype.Service;

import com.example.demo.domain.Transfer;
import com.example.demo.infrastructure.repository.TransferRepository;
import com.example.demo.service.TransferService;
import java.time.LocalDate;
import java.util.List;

@Service
public class TransferServiceImpl implements TransferService {
    private final TransferRepository transferRepository;

    public TransferServiceImpl(TransferRepository transferRepository) {
        this.transferRepository = transferRepository;
    }

    @Override
    public List<Transfer>getTransfersLastMonth() {
        LocalDate oneMonthAgo = LocalDate.now().minusMonths(1);
        return transferRepository.findByFechaTransferenciaAfter(oneMonthAgo);
    }
}
