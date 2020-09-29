package com.agazin.exasync;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class ExAsyncApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExAsyncApplication.class, args).close();
	}

}
