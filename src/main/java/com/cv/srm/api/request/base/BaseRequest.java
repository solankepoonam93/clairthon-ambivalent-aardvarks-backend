package com.cv.srm.api.request.base;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseRequest<T extends Serializable> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1038658154894638516L;
	@JsonProperty("requestType")
	private String requestType;
	@JsonProperty("requestFrom")
	private String requestFrom;
	@JsonProperty("requestVersion")
	private String requestVersion;
	@JsonProperty("parameters")
	private T parameters;
	
}
