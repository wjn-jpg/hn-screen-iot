package com.ntdq.hnscreen;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.ntdq.hnscreen.mapper"})
public class HnScreenApplication {

	public static void main(String[] args) {
		SpringApplication.run(HnScreenApplication.class, args);
	}

}
