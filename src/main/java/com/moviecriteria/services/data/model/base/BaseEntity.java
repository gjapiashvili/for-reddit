package com.moviecriteria.services.data.model.base;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.moviecriteria.services.data.enums.Status;
import com.moviecriteria.services.data.enums.converters.StatusConverter;

import javax.persistence.*;
import java.time.LocalDateTime;

@MappedSuperclass // this is needed for base entity
public class BaseEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private LocalDateTime createdAt;

  private LocalDateTime updatedAt;

  @Convert(converter = StatusConverter.class)
  @Column(nullable = false)
  protected Status status = Status.ACTIVE;

  @JsonIgnore
  public boolean isDeleted() {
    return Status.DELETED == status;
  }

  @JsonIgnore
  public boolean isActive() {
    return Status.ACTIVE == status;
  }

  //region Getters
  public Long getId() {
    return id;
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public LocalDateTime getUpdatedAt() {
    return updatedAt;
  }

  public Status getStatus() {
    return status;
  }
  //endregion

  //region Setters
  public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public void setUpdatedAt(LocalDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }
  //endregion
}