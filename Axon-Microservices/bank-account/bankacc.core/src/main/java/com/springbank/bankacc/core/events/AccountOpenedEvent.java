package com.springbank.bankacc.core.events;

import com.springbank.bankacc.core.models.AccountType;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class AccountOpenedEvent {
    private String id;
    private String accountHolderId;
    private AccountType accountType;
    private LocalDate creationDate;
    private double openingBalance;
}
