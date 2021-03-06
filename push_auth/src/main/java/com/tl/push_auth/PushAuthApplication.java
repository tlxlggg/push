package com.tl.push_auth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.tl.push_dao.*")
public class PushAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(PushAuthApplication.class, args);
	}
}
