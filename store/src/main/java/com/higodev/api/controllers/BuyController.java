package com.higodev.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.higodev.api.controllers.dtos.BuyDto;
import com.higodev.api.services.BuyService;

@RestController
@RequestMapping(path = "/buy")
public class BuyController {

	@Autowired
	private BuyService buyService;

	@PostMapping
	public void makeBuy(@RequestBody BuyDto buyDto) {
		buyService.makeBuy(buyDto);
	}

}
