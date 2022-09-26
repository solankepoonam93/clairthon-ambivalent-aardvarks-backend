package com.cv.srm.api.request;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuthenticationParams implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8041406772985058308L;
	@JsonProperty("email")
	private String email;
	@JsonProperty("password")
	private String password;
	
}