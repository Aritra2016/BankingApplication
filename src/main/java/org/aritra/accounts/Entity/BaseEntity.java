package org.aritra.accounts.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@MappedSuperclass   //This indicated Spring Data Jpa that this class will act as Super class for all entity classes
@Getter @Setter @ToString
public class BaseEntity {

    @Column(updatable = false)
    private LocalDateTime createdAt;

    @Column(updatable = false)
    private String createdBy;

    @Column(insertable = false )
    private LocalDateTime updatedAt;

    @Column(insertable = false)
    private String updatedBy;


}
