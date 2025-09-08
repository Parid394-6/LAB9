package com.sqa.lab.data.stub;

import java.util.Arrays;
import java.util.List;

import com.sqa.lab.api.MovieService;


public class MovieServiceStub implements MovieService {
	
    public List<String> getMovies(String username) {
        
        return Arrays.asList(
        		 "John Wick|Action",
                 "Mad Max: Fury Road|Action",
                 "The Notebook|Romance",
                 "A Quiet Place|Horror",
                 "Interstellar|Sci-Fi"
        );
    }

}
