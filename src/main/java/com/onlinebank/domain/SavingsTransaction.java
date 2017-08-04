package com.onlinebank.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data @NoArgsConstructor
public class SavingsTransaction {

    private Long id;
    private Date date;
    private String description;
    private String type;
    private String status;
    private double amount;
    private BigDecimal availableBalance;

    private SavingsAccount savingsAccount;
}
