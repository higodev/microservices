package com.higodev.api.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.higodev.api.entities.InfoProvider;
import com.higodev.api.services.InfoService;

@RestController
@RequestMapping("/info")
public class InfoController {
	
	@Autowired
	private InfoService infoService;
	
	@GetMapping("/{state}")
	public Optional<InfoProvider> getInfoByState(@PathVariable("state") String state) {
		return infoService.getInfo(state);
	}

}
