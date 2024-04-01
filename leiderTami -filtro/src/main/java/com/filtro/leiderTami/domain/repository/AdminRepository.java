package com.filtro.leiderTami.domain.repository;

import com.filtro.leiderTami.persistence.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
    Admin findByUsername(String username);
}
