package com.moviecriteria.services.data.enums;

public enum AuthorityType {
  USER(1, "USER"),
  ADMIN(2, "ADMIN");

  private int id;
  private String name;

  AuthorityType(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public static AuthorityType getFromId(int id) {
    for (AuthorityType authorityType : AuthorityType.values()) {
      if (authorityType.getId() == id) {
        return authorityType;
      }
    }

    throw new RuntimeException(AuthorityType.class.getName()  + " with provided id[" + id + "] not found");
  }

}
