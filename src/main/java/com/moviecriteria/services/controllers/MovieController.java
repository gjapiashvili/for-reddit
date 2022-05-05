package com.moviecriteria.services.controllers;

import com.moviecriteria.services.data.model.Movie;
import com.moviecriteria.services.services.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = {"/movies"}, produces = APPLICATION_JSON_VALUE)
public class MovieController {
  private MovieService movieService;

  public MovieController(MovieService movieService) {
    this.movieService = movieService;
  }

  @GetMapping(path = "/{id}")
  public Movie findById(@PathVariable Long id) {
    return movieService.getOne(id);
  }

}
