package com.khangdjnh.identity_keycloak.repository;

import com.khangdjnh.identity_keycloak.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository <User, String> {
    boolean existsByEmail(String email);
    boolean existsById(String id);
    boolean existsByUsername(String userName);
    Optional<User> findByUserId(String userId);
    User findByUserKeycloakId(String userKeycloakId);
    Optional<User> findByEmail(String email);
}
