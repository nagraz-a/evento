package com.datafoundry.evento.model;

import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
@Document(collection="user")
public class User {
	@Id
	private ObjectId _id;
	private String first_name;
	private String last_name;
	private String email;
	private String phoneno;
	private String password;
	private Address address;
	private Date last_login;
	private List<String> intrests;
	private String token;
	private String status;
	private boolean is_active;

}
