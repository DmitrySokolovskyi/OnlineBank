package com.onlinebank.repository;

import com.onlinebank.domain.security.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Integer>{
    Role findByName(String name);
}
