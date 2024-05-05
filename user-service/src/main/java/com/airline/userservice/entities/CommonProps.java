package com.airline.userservice.entities;

import jakarta.persistence.MappedSuperclass;
import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@MappedSuperclass
public abstract class CommonProps {
  private Date createdBy;
  private Date updatedBy;
  private Date creationDate;
  private Date updateDate;
}
