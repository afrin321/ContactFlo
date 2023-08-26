package com.contactflow.EmailService.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailGeneration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String apiKey;
    @Column
    private String status;
    @Column
    private int callsRemaining;
    @Column
    private LocalDateTime createdAt;
    @Column
    private LocalDateTime updatedAt;

    @PrePersist
    public void setCreationTime() {
        this.createdAt = LocalDateTime.now();
    }

    @PreUpdate
    public void setUpdateTime() {
        this.updatedAt = LocalDateTime.now();
    }
}
