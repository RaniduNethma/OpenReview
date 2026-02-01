package com.openreview.persistence.repository;

import com.openreview.persistence.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Repository for User entity
 * Spring Data JPA automatically implements CRUD operations
 */

@Repository
public interface UserRepository extends JpaRepository <User, String>{

    /**
     * Find user by GitHub ID
     * @param githubId GitHub User ID
     * @return Optional containing user if found
     */
    Optional<User> findByGithubId(Long githubId);

    /**
     * Find user by username
     * @param username GitHub username
     * @return Optional containing user if found
     */
    Optional<User> findByUsername(String username);

    /**
     * Check if user exists by GitHub ID
     * @param githubId GitHub user ID
     * @return true if user exist
     */
    boolean existsByGithubId(Long githubId);
}
