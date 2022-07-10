package com.bbuhha.alivetostipa.repository;

import com.bbuhha.alivetostipa.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long>
{
    Role findByName(String name);
}
