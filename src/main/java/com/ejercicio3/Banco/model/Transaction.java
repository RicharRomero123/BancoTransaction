package com.ejercicio3.Banco.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="type",length = 10, nullable = false)
    private String type;
    @Column(name="create_date",nullable = false)
    private LocalDate createDate;
    @Column(name="amourt",nullable = false)
    private Double amount;
    @Column(name="balance",nullable = false)
    private Double balance;
    @ManyToOne
    @JoinColumn(name="account_id",nullable = false,foreignKey = @ForeignKey(name="FK_ACCOUNT_ID"))
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Account account;

}
