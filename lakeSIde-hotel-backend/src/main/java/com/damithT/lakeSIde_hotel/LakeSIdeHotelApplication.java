package com.damithT.lakeSIde_hotel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class LakeSIdeHotelApplication {

	public static void main(String[] args) {

		SpringApplication.run(LakeSIdeHotelApplication.class, args);
	}

}
