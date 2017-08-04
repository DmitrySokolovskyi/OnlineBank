package com.onlinebank.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data @NoArgsConstructor
public class PrimaryAccount {

    private Long id;
    private int accountNumber;
    private BigDecimal accountBalance;
}
