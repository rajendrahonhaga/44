package io.bedi.moviecatalogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import io.github.resilience4j.common.circuitbreaker.configuration.CircuitBreakerConfigCustomizer;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class MovieCatalogServiceApplication {

	@Bean
	@LoadBalanced
	public RestTemplate getResTemplate() {
		return new RestTemplate();
	}

//	@Bean
//	@LoadBalanced
//	public WebClient.Builder webClientBuilder() {
//		return WebClient.builder();
//	}

	public static void main(String[] args) {
		SpringApplication.run(MovieCatalogServiceApplication.class, args);
	}

}
