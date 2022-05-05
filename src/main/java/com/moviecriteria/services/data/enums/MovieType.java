package com.moviecriteria.services.data.enums;

public enum MovieType {
  MOVIE(1),
  TV_MOVIE(2),
  SHORT_MOVIE(8);

  private int id;

  MovieType(int id) {
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public static MovieType getFromId(int id) {
    for (MovieType movieType : MovieType.values()) {
      if (movieType.getId() == id) {
        return movieType;
      }
    }

    throw new RuntimeException(MovieType.class.getName()  + " with provided id[" + id + "] not found");
  }
}
