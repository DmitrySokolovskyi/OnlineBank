package com.onlinebank.service;

import com.onlinebank.domain.PrimaryAccount;
import com.onlinebank.domain.SavingsAccount;

import java.security.Principal;

public interface AccountService {
    PrimaryAccount createPrimaryAccount();
    SavingsAccount createSavingsAccount();
    void deposit(String accountType, double amount, Principal principal);
}
