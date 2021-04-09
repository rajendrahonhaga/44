package io.bedi.ratingdataservice.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.bedi.ratingdataservice.Models.Rating;
import io.bedi.ratingdataservice.Models.UserRating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {
	
	@Autowired
	UserRating userRating;

	@RequestMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId) {
		return new Rating(movieId, 4);
	}
	
	@RequestMapping("users/{userId}")
	public UserRating getUserRating(@PathVariable("userId") String userId) {
		List<Rating> ratings = Arrays.asList(
				new Rating("1234", 4),
				new Rating("5678", 3)
		);
		userRating.setUserRating(ratings);
		return userRating;
	}
}
