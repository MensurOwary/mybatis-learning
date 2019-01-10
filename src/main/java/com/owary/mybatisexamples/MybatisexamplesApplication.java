package com.owary.mybatisexamples;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.owary.mybatisexamples.mapper")
@SpringBootApplication
public class MybatisexamplesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisexamplesApplication.class, args);
	}

}

