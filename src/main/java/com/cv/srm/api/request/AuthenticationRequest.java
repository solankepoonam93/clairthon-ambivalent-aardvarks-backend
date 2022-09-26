package com.cv.srm.api.request;

import java.io.Serializable;

import com.cv.srm.api.request.base.BaseRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuthenticationRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5462247479635656613L;
	
	@JsonProperty("request")
	private BaseRequest<AuthenticationParams> request;
	
}
