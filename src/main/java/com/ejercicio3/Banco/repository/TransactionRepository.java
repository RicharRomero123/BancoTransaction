package com.ejercicio3.Banco.repository;

import com.ejercicio3.Banco.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction,Long> {

    boolean existsByNameCustomer(String nameCustomer);
    List<Transaction> filterByNameCustomer(String nameCustomer);

    boolean existsByCreateDateRange(LocalDate First_createDate, LocalDate Last_createDate);
    List<Transaction> filterByCreateDateRange(LocalDate First_createDate, LocalDate Last_createDate);
}
