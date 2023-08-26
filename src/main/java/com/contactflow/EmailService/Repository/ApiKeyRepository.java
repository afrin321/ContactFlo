package com.contactflow.EmailService.Repository;

import com.contactflow.EmailService.Entity.ApiKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ApiKeyRepository extends JpaRepository<ApiKey, Integer> {

    @Query(nativeQuery = true, value = "SELECT * FROM contactflow.api_key where api_key.email=:email")
    public List<ApiKey> findByEmailCustomQuery(@Param("email") String email);

    @Query(nativeQuery = true, value = "SELECT email FROM contactflow.api_key where api_key.api_key=:apiKey")
    public List<String> findByApiKeyCustomQuery(@Param("apiKey") String apiKey);

}
