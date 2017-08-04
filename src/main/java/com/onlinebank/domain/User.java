package com.onlinebank.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data @NoArgsConstructor
public class User {

    private Long userId;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    private boolean enabled = true;

    private PrimaryAccount primaryAccount;

    private SavingsAccount savingsAccount;

    private List<Appointment> appointmentList;

    private List<Recipient> recipientList;
}
