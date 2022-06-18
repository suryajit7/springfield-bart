package com.suryajit7.springfieldbart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class SpringfieldBartApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringfieldBartApplication.class, args);
	}

}
