package com.zwq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//扫描 mybatis mapper 包路径
@MapperScan(basePackages = "com.zwq.mapper")
public class SpringbootWebStarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWebStarterApplication.class, args);
	}
}
