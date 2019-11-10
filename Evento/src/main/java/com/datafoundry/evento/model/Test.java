package com.datafoundry.evento.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor 
public class Test {
	@Id
	private String id;
	private String name;
	private String regdno;
	private String age;
}
