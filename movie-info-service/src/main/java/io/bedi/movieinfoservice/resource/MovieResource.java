package io.bedi.movieinfoservice.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.bedi.movieinfoservice.Models.Movie;
import io.bedi.movieinfoservice.Models.MovieList;

@RestController
@RequestMapping("/movies")
@CrossOrigin(origins = "*", maxAge = 3600)
public class MovieResource {
	
	@Autowired
	MovieList mList;

	@RequestMapping("/")
	public MovieList getMoviesInfo() {
		
		List<Movie> movielist = Arrays.asList(
				new Movie("1234", "Movie1"),
				new Movie("5678", "Movie2"),
				new Movie("9101112", "Movie3")
		);
		mList.setMovieList(movielist);
		return mList;
	}	
	
	@RequestMapping("/{movieId}")
	public Movie getMovieInfo(@PathVariable("movieId") String movieId) {
		return new Movie("movieId","TestMovie");
		
	}
	

}
