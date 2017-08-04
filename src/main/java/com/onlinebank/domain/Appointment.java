package com.onlinebank.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data @NoArgsConstructor
public class Appointment {

    private Long id;
    private Date date;
    private String location;
    private String description;
    private boolean confirmed;

    private User user;
}
