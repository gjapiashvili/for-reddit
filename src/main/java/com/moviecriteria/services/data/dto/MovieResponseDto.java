package com.moviecriteria.services.data.dto;


import com.moviecriteria.services.data.model.Movie;

public class MovieResponseDto {
  private Long id;
  private String title;
  private int year;

  public MovieResponseDto(Movie movie ) {
    this.id = movie.getId();
    this.title = movie.getTitle();
    this.year = movie.getYear();
  }

  public Long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public int getYear() {
    return year;
  }
}
