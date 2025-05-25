package org.aritra.accounts.Entity;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@MappedSuperclass   //This indicated Spring Data Jpa that this class will act as Super class for all entity classes
@Getter @Setter @ToString
public class BaseEntity {

    private LocalDateTime createdAt;

    private String createdBy;

    private LocalDateTime updatedAt;

    private String updatedBy;


}
