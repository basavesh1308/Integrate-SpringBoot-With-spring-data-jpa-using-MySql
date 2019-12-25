package com.basaveshinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.basaveshinfo.repository")
public class IntegrateSpringBootWithMySqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntegrateSpringBootWithMySqlApplication.class, args);
	}

}
