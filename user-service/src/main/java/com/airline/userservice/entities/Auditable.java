package com.airline.userservice.entities;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Data
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public abstract class Auditable {
  private Date createdBy;
  private Date updatedBy;
  private Date creationDate;
  private Date updateDate;
}
