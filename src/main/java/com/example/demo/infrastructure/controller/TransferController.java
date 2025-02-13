package com.example.demo.infrastructure.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.Transfer;
import com.example.demo.service.TransferService;
import java.util.List;

@RestController
@RequestMapping("/api/transfers")
public class TransferController {
    private final TransferService transferService;

    public TransferController(TransferService transferService) {
        this.transferService = transferService;
    }

    @GetMapping("/last-month")
    public ResponseEntity<List<Transfer>> getTransfersLastMonth() {
        return ResponseEntity.ok(transferService.getTransfersLastMonth());
    }
}
