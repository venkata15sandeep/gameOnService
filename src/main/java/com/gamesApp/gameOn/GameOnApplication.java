package com.gamesApp.gameOn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication()

@EnableTransactionManagement

public class GameOnApplication {

	public static void main(String[] args) {
		SpringApplication.run(GameOnApplication.class, args);
	}

}
