package com.higodev.api.controllers.dtos;

import lombok.Data;

@Data
public class AddressDto {
	private String street;
	private String number;
	private String state;
}
