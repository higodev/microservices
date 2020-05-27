package com.higodev.api.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.higodev.api.entities.InfoProvider;
import com.higodev.api.repositories.InfoRepository;

@Service
public class InfoService {

	@Autowired
	private InfoRepository repository;
	
	public Optional<InfoProvider>getInfo(String state) {
		return repository.findByState(state);
	}
	
}
