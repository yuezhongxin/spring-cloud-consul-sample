package com.example.springbootribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;
import org.springframework.context.annotation.Bean;
//import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;

@SpringBootApplication
public class SpringBootRibbonApplication {

	//开启软均衡负载
	//@LoadBalanced
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRibbonApplication.class, args);
	}
}
