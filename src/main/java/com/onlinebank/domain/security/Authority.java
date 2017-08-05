package com.onlinebank.domain.security;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

@Data
public class Authority implements GrantedAuthority {

    private final String authority;
}
