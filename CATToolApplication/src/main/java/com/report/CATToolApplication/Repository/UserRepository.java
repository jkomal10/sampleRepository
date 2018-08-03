package com.report.CATToolApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.report.CATToolApplication.Entity.Users;

public interface UserRepository extends JpaRepository<Users, Long>{

	Users findByUsername(String username);
}