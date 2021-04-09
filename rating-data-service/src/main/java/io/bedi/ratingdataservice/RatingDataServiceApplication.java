package io.bedi.ratingdataservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import io.bedi.ratingdataservice.Models.UserRating;

@EnableEurekaClient
@SpringBootApplication
public class RatingDataServiceApplication {

	@Bean
	public UserRating getuserRating() {
		return new UserRating();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(RatingDataServiceApplication.class, args);
	}

}
