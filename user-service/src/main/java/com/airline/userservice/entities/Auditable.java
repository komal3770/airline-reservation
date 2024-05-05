package com.airline.userservice.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Data
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public abstract class Auditable {
  @CreatedBy
  protected Long createdBy;

  @CreatedDate
  @Column(nullable = false, updatable = false)
  protected LocalDateTime createdDate;

  @LastModifiedBy
  protected Long lastModifiedBy;

  @LastModifiedDate
  protected LocalDateTime lastModifiedDate;
}
