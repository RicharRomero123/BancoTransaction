package com.ejercicio3.Banco.repository;

import com.ejercicio3.Banco.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Long> {

  List<Account> findByNameCostumer(String nameCostumer);
  List<Account> findByNumberAccount(String numberAccount);
  boolean existsByNameCostumerAndNumberAccount(String nameCostumer, String numberAccount);



}
