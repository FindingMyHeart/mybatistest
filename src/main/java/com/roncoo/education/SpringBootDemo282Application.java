package com.roncoo.education;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.roncoo.education.mapper")
@SpringBootApplication
public class SpringBootDemo282Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemo282Application.class, args);
	}
}
