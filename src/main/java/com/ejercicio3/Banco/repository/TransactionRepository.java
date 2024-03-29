package com.ejercicio3.Banco.repository;

import com.ejercicio3.Banco.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction,Long> {

    boolean existsByNameCustomer(String nameCustomer);
    @Query("SELECT t FROM Transaction t WHERE t.account.nameCustomer=:nameCustomer")
    List<Transaction> filterByNameCustomer(@Param("nameCustomer") String customer);

    boolean existsByCreateDateRange(LocalDate First_createDate, LocalDate Last_createDate);

    @Query("SELECT t FROM Transaction t WHERE t.createDate BETWEEN :first_date_created AND :second_date_created")
    List<Transaction> filterByCreateDateRange(@Param("first_date_created") LocalDate first_date_created, @Param("second_date_created") LocalDate second_date_created);
}
