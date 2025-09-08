package com.sqa.lab.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.sqa.lab.data.stub.MovieServiceStub;
import com.sqa.lab.api.MovieService;

class FavoriteMovieStubTest {

	@Test
	void test() {
		MovieService movieservice = new MovieServiceStub();
		FavoriteMovie favoritemovie = new FavoriteMovie(movieservice);
		
		List<String> movielist = favoritemovie.getMovies("KK","Action");
		
		assertEquals(2, movielist.size());
	}

}
