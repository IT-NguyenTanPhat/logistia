package com.logistia.user_service.Repository;

import com.logistia.user_service.Model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    public Role findByName(String role);
}
