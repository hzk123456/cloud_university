package com.chinasoft.system.data.repository;

import com.chinasoft.system.data.entity.Role;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Page<Role> findByName(@Param("name") String name, Pageable pageRequest);
}
