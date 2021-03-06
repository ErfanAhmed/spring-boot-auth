package com.example.auth.repository;

import com.example.auth.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author erfan
 * @since 12/5/19
 */
public interface RoleRepository extends JpaRepository<Role, Long> {
}
