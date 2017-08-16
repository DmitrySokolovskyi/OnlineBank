package com.onlinebank;

import com.onlinebank.domain.security.Role;
import com.onlinebank.repository.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OnlinebankApplication {
	public static void main(String[] args) {
		SpringApplication.run(OnlinebankApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(RoleRepository roleRepository) {
		return args -> {
			roleRepository.save(new Role(0, "ROLE_USER"));
			roleRepository.save(new Role(1, "ROLE_ADMIN"));
		};
	}
}