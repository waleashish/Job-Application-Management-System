package com.bje.jamapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication()
@EnableJpaRepositories(basePackages = "com.bje.jamapp.dao.repo")
public class JamappApplication {

	public static void main(String[] args) {
		SpringApplication.run(JamappApplication.class, args);
	}

}
