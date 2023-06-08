package com.ejercicio3.Banco.controller;

import com.ejercicio3.Banco.repository.TransactionRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bank/v1")
public class TranscationController
{
    private TransactionRepository transactionRepository;
}
