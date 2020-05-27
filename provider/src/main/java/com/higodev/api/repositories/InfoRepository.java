package com.higodev.api.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.higodev.api.entities.InfoProvider;

@Repository
public interface InfoRepository extends JpaRepository<InfoProvider, Long>{
	Optional<InfoProvider> findByState(String state);
}
