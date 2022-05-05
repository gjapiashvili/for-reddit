package com.moviecriteria.services.services.impl;

import com.moviecriteria.services.data.model.Movie;
import com.moviecriteria.services.repositories.MovieRepository;
import com.moviecriteria.services.services.MovieService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class MovieServiceImpl implements MovieService {
  private MovieRepository movieRepository;

  public MovieServiceImpl(MovieRepository movieRepository) {
    this.movieRepository = movieRepository;
  }

  @Override
  public Movie getOne(Long id) {
    Movie ret;
    var foundMovie = movieRepository.findById(id);

    if (foundMovie.isPresent()) {
      ret = foundMovie.get();
    } else {
      throw new RuntimeException("Movie with ID " + id + " not found!");
    }

    return ret;
  }

}
