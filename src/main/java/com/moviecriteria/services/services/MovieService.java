package com.moviecriteria.services.services;

import com.moviecriteria.services.data.model.Movie;

public interface MovieService {
  Movie getOne(Long id);
}
