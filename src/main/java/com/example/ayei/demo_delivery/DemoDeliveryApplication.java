package com.example.ayei.demo_delivery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication

@ComponentScan(basePackages = "com.example.ayei.demo_delivery.services.ItemService")
public class DemoDeliveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoDeliveryApplication.class, args);
	}

}
