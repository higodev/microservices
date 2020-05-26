package com.higodev.api.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.higodev.api.controllers.dtos.BuyDto;

@RestController
@RequestMapping(path = "compras")
public class BuyController {

	@PostMapping
	public void makeBuy(@RequestBody BuyDto buyDto) {
		System.out.println(buyDto);
	}

}
