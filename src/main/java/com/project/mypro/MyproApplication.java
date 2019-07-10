package com.project.mypro;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.project.mypro.mapper")
public class MyproApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyproApplication.class, args);
	}

}
