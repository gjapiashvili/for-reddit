package com.moviecriteria.services.repositories;

import com.moviecriteria.services.data.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
