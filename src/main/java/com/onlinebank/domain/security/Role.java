package com.onlinebank.domain.security;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data @NoArgsConstructor
public class Role {

    @Id
    private int roleId;

    private String name;

    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<UserRole> userRoles = new HashSet<>();

    public Role(int roleId, String name) {
        this.roleId = roleId;
        this.name = name;
    }
}