package com.report.CATToolApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.report.CATToolApplication.Entity.Application;

public interface ApplicationRepository extends JpaRepository<Application, Long>{

}
