package com.example.demo.service;


import java.util.List;

import com.example.demo.domain.Transfer;

public interface TransferService {
   List<Transfer> getTransfersLastMonth();
}
