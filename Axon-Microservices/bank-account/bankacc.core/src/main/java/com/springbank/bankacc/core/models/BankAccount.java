package com.springbank.bankacc.core.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class BankAccount {
    @Id
    private String id;
    private String accountHolderId;
    private LocalDate creationDate;
    private AccountType accountType;
    private double balance;
}
