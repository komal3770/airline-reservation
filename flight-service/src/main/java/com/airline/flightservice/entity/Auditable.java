package com.airline.flightservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import java.time.LocalDateTime;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
@Data
public abstract class Auditable {
  @CreatedBy protected Long createdBy;

  @CreatedDate
  @Column(nullable = false, updatable = false)
  protected LocalDateTime createdDate;

  @LastModifiedBy protected Long lastModifiedBy;

  @LastModifiedDate protected LocalDateTime lastModifiedDate;
}
