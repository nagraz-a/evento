package com.datafoundry.evento.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@RequiredArgsConstructor
public class Address {

	private String door_no;
	private String building_name;
	private String street;
	private String locality;
	private String landmark;
	private String city;
	private String state;
	private String pincode;
	
}
