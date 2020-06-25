package com.fms.flight_management.domain.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.fms.flight_management.domain.entity.Airport;


@Transactional
public interface AirportRepository extends JpaRepository<Airport, String> {
	
}
