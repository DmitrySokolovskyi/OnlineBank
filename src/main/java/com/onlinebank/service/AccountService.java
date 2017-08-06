package com.onlinebank.service;

import com.onlinebank.domain.PrimaryAccount;
import com.onlinebank.domain.SavingsAccount;

public interface AccountService {
    PrimaryAccount createPrimaryAccount();
    SavingsAccount createSavingsAccount();
}
