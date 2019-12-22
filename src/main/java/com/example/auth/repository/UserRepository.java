package com.example.auth.repository;

import com.example.auth.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author erfan
 * @since 12/5/19
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
