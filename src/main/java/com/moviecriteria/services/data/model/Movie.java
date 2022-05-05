package com.moviecriteria.services.data.model;

import com.moviecriteria.services.data.model.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(schema = "public", name = "movies")
public class Movie extends BaseEntity {

  @Column(nullable = false)
  private String externalId;

  private String title;

  private int year;


  //region Getters

  public String getTitle() {
    return title;
  }

  public int getYear() {
    return year;
  }

  public String getExternalId() {
    return externalId;
  }

  //endregion
}