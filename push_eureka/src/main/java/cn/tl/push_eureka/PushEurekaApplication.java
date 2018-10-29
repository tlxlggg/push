package cn.tl.push_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class PushEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PushEurekaApplication.class, args);
	}
}
