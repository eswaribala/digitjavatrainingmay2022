package com.softura.healthcareapi.dtos;

import lombok.Data;

//DTO
@Data
public class JwtRequest {

	private String userName;
	private String userPwd;
	
	
}
