package com.tujuhsembilan.app.repository;

import com.tujuhsembilan.app.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RoleRepository extends JpaRepository<Role, UUID> {
    Role findByRoleName(String roleName);
    Role findFirstByRoleName(String roleName);
}
