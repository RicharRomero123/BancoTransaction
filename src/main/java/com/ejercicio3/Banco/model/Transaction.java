package com.ejercicio3.Banco.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="transactions")
public class Transaction {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(name = "type", nullable = false)
  private String type;

  @Column(name = "amount", nullable = false)
  private double amount;

  @Column(name = "balance", nullable = false)
  private double balance;

  @Column(name = "account_id", nullable = false)
  private long accountId;

  @Column(name = "create_date", nullable = false)
  private LocalDateTime createDate;
}
