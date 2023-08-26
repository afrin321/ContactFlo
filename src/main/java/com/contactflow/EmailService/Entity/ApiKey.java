package com.contactflow.EmailService.Entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiKey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String email;

    @Column
    private String apiKey;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }
}
