package com.moviecriteria.services.data.enums;


public enum Status {
  ACTIVE(1, "ACTIVE"),
  INACTIVE(2, "INACTIVE"),
  DELETED(3, "DELETED");

  private int id;
  private String name;

  Status(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public static Status getFromId(int id) {
    for (Status status : Status.values()) {
      if (status.getId() == id) {
        return status;
      }
    }
    throw new RuntimeException("Status with provided id[" + id + "] not found");
  }

  public static Status getFromName(String name) {
    for (Status status : Status.values()) {
      if (status.getName().equals(name)) {
        return status;
      }
    }
    throw new RuntimeException(MovieType.class.getName()  + " with provided name[" + name + "] not found");
  }
}