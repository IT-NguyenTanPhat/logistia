package com.logistia.user_service.Repository;

import com.logistia.user_service.Model.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, Long> {
    public Authority findByName(String name);
}
