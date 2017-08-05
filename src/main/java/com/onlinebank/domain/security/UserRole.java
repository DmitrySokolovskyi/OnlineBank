package com.onlinebank.domain.security;

import com.onlinebank.domain.User;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.FetchType.EAGER;
import static javax.persistence.GenerationType.AUTO;

@Data @NoArgsConstructor
@Entity
@Table(name="user_role")
public class UserRole {
    @Id
    @GeneratedValue(strategy = AUTO)
    private long userRoleId;

    public UserRole(User user, Role role) {
        this.user = user;
        this.role = role;
    }

    @ManyToOne(fetch = EAGER)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = EAGER)
    @JoinColumn(name = "role_id")
    private Role role;
}