package com.onlinebank.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
public class Recipient {

    private Long id;
    private String name;
    private String email;
    private String phone;
    private String accountNumber;
    private String description;

    private User user;
}
