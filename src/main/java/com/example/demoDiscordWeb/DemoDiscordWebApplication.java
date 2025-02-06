package com.example.demoDiscordWeb;

import ad.ya.demoDiscord.DemoDiscordApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoDiscordWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoDiscordWebApplication.class, args);
		DemoDiscordApplication.main(args);
	}

}
