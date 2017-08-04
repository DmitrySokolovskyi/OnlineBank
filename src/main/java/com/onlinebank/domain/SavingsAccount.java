package com.onlinebank.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data @NoArgsConstructor
public class SavingsAccount {

    private Long id;
    private int accountNumber;
    private BigDecimal accountBalance;

    private List<SavingsTransaction> savingsTransactionList;
}
