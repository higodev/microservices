package com.higodev.api.controllers.dtos;

import java.util.List;

import lombok.Data;

@Data
public class BuyDto {
	private List<BuyItemDto> items;
	private AddressDto address;
}
