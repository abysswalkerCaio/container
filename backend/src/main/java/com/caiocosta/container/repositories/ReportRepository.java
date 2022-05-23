package com.caiocosta.container.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caiocosta.container.entities.Report;

public interface ReportRepository extends JpaRepository<Report, Long> {

}
