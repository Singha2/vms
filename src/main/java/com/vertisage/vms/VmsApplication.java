package com.vertisage.vms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VmsApplication {
	public static void main(String[] args) {
		System.setProperty("server.servlet.context-path", "/vms");
		SpringApplication.run(VmsApplication.class, args);
	}

}
