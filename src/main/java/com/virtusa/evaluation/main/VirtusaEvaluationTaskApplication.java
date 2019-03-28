package com.virtusa.evaluation.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.virtusa"})
public class VirtusaEvaluationTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(VirtusaEvaluationTaskApplication.class, args);
	}

}
