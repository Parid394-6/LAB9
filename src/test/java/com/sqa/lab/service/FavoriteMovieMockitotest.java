package com.sqa.lab.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.sqa.lab.api.MovieService;

class FavoriteMovieMockitotest {

	@Test
	void testMockito() {
		MovieService movieservice = mock(MovieService.class);
		List<String> movielist = Arrays.asList("John Wick|Action","Mad Max: Fury Road|Action");
		
		when(movieservice.getMovies("KK")).thenReturn(movielist);
		
		FavoriteMovie favoritemovie = new FavoriteMovie(movieservice);
		List<String> actionmovielist = favoritemovie.getMovies("KK", "Action");
		
		assertEquals(2, actionmovielist.size());
		
	}

}
