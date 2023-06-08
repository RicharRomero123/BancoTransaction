package com.ejercicio3.Banco.service.Implementation;

import com.ejercicio3.Banco.repository.AccountRepository;
import com.ejercicio3.Banco.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl {
@Autowired
private AccountRepository accountRepository;
}
