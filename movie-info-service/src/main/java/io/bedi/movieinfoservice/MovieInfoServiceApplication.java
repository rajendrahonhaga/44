package io.bedi.movieinfoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import io.bedi.movieinfoservice.Models.MovieList;

@EnableEurekaClient
@SpringBootApplication
public class MovieInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieInfoServiceApplication.class, args);
	}
	
//	@Bean
//	public MovieList getMovieListObj() {
//		return new MovieList();
//	}

}
