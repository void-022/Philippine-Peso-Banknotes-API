package com.github.void022.phpbanknotes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PhpBanknotesApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhpBanknotesApiApplication.class, args);
		System.out.print("Hallo world!");
	}

}
