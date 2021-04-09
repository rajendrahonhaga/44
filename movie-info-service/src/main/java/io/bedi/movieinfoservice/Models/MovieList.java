package io.bedi.movieinfoservice.Models;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class MovieList {
	private List<Movie> movieList;
	
	public MovieList() {
	}
	
	public MovieList(List<Movie> movieList) {
		this.movieList = movieList;
	}


	public List<Movie> getMovieList() {
		return movieList;
	}

	public void setMovieList(List<Movie> movieList) {
		this.movieList = movieList;
	}
}
