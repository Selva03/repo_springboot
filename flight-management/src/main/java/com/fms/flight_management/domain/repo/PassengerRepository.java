package com.fms.flight_management.domain.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.fms.flight_management.domain.entity.Passenger;



@Transactional
public interface PassengerRepository extends JpaRepository<Passenger, String> {
	
	Optional<Passenger> findByEmail(String email);
	
}
