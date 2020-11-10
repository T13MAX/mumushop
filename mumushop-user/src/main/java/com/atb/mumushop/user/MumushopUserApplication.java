package com.atb.mumushop.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.atb.mumushop.user.mapper")
@SpringBootApplication
public class MumushopUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(MumushopUserApplication.class, args);
	}

}
