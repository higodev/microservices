package com.higodev.api.services;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.higodev.api.controllers.dtos.BuyDto;
import com.higodev.api.controllers.dtos.InfoProviderDto;

@Service
public class BuyService {

	public void makeBuy(BuyDto buyDto) {
		RestTemplate client = new RestTemplate();
		ResponseEntity<InfoProviderDto> exchange = client.exchange(
				"http://localhost:8081/info/" + buyDto.getAddress().getState(), HttpMethod.GET, null,
				InfoProviderDto.class);
		System.out.println("Fornecedor eh de " + exchange.getBody().getState());
	}

}
