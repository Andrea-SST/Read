package com.fonyou.api_readToConfluence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class
ApiReadToConfluenceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiReadToConfluenceApplication.class, args);
	}

}
