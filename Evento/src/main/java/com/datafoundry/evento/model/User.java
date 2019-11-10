package com.datafoundry.evento.model;

import java.util.Date;
import java.util.List;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@RequiredArgsConstructor
public class User {
	
	private String first_name;
	private String last_name;
	private String email;
	private String password;
	private String phoneno;
	private Address address;
	private Date last_login;
	private boolean is_active;
	private List<String> intrests;

}
