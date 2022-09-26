package com.cv.srm.api.response.result;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuthenticationResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4218287951849029892L;

	@JsonProperty("authToken")
	private String authToken;
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("userId")
	private Integer userId;

}