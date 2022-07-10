package com.bbuhha.alivetostipa.repository;

import com.bbuhha.alivetostipa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>
{
    User findByUsername(String username);
}
