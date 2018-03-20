package com.lxyer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lxyer.dao")
public class LxyerApplication{

	public static void main(String[] args) {
		SpringApplication.run(LxyerApplication.class, args);
	}
}
