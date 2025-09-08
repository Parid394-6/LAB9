package com.sqa.lab.service;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import com.sqa.lab.api.MovieService;

public class FavoriteMovie {
    private final MovieService movieService;

    public FavoriteMovie(MovieService movieService) {
        this.movieService = movieService;
    }

   
    public List<String> getMovies(String username, String genre) {
        List<String> all = movieService.getMovies(username);

        final String target = genre.toLowerCase(Locale.ROOT);

        return all.stream()
                  .filter(s -> {
                      String[] parts = s.split("\\|");
                      return parts.length == 2 &&
                             parts[1].trim().toLowerCase(Locale.ROOT).equals(target);
                  })
                  .map(s -> s.split("\\|")[0].trim())
                  .collect(Collectors.toList());
    }

}
