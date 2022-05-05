package com.moviecriteria.services.data.enums.converters;

import com.moviecriteria.services.data.enums.Status;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class StatusConverter implements AttributeConverter<Status, Integer> {
  @Override
  public Integer convertToDatabaseColumn(Status status) {
    return status.getId();
  }

  @Override
  public Status convertToEntityAttribute(Integer id) {
    return id == null ? null : Status.getFromId(id);
  }
}
