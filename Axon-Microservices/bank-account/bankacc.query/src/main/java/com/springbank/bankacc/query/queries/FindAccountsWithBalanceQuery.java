package com.springbank.bankacc.query.queries;

import com.springbank.bankacc.query.dto.EqualityType;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FindAccountsWithBalanceQuery {
    private EqualityType equalityType;
    private double balance;
}
