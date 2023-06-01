package com.railway.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.railway.entity.ERole;
import com.railway.entity.Role;



public interface RoleRepository extends JpaRepository<Role, String> {
  Optional<Role> findByName(ERole name);
}
