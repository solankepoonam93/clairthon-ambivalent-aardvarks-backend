package com.cv.srm.api.response.base;

import java.io.Serializable;

import org.springframework.http.HttpStatus;

import com.cv.srm.api.request.base.BaseRequest;
import com.cv.srm.constants.ErrorMessageConstants;
import com.cv.srm.util.AppUtils;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseResponse<T extends Serializable> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3924566877845873051L;
	@JsonProperty("requestType")
	private String requestType;
	@JsonProperty("success")
	private boolean success;
	@JsonProperty("httpStatusCd")
	private int httpStatusCd;
	@JsonProperty("httpStatusMsg")
	private String httpStatusMsg;
	@JsonProperty("displayPortalMsg")
	private String displayPortalMsg;
	@JsonProperty("displayAppMsg")
	private String displayAppMsg;
	@JsonProperty("result")
	private T result;

	public void populateSuccessDisplayMsgForPortalAndApp(String portalMsg, String appMsg) {
		setDisplayPortalMsg(portalMsg);
		setDisplayAppMsg(appMsg);
	}

	public void populateHttpStatusCdAndMsg(HttpStatus httpStatus) {
		setHttpStatusCd(httpStatus.value());
		setHttpStatusMsg(httpStatus.getReasonPhrase());
	}

	public void populateType(BaseRequest<?> baseRequest) {
		setRequestType(baseRequest.getRequestType());
	}
	
	public void populateServerError() {
		long logToken = AppUtils.generateUniqueTokenForLog();

		setSuccess(false);
		setHttpStatusCd(HttpStatus.INTERNAL_SERVER_ERROR.value());
		setHttpStatusMsg(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
		setDisplayPortalMsg(ErrorMessageConstants.SERVER_ERROR_PORTAL + logToken);
		setDisplayAppMsg(ErrorMessageConstants.SERVER_ERROR_APP);
	}

	public void populateGenericMissingFieldErrorMsg() {
		setSuccess(false);
		populateHttpStatusCdAndMsg(HttpStatus.BAD_REQUEST);
		setDisplayPortalMsg(ErrorMessageConstants.REQUIRED_GENERAL_MISSING_INFORMATION_MSG);
		setDisplayAppMsg(ErrorMessageConstants.REQUIRED_GENERAL_MISSING_INFORMATION_MSG);
	}

	public void populateInvalidRequestFormatErrorMsg() {
		setSuccess(false);
		populateHttpStatusCdAndMsg(HttpStatus.BAD_REQUEST);
		setDisplayPortalMsg(ErrorMessageConstants.IMPROPER_USER_REQUEST_PORTAL);
		setDisplayAppMsg(ErrorMessageConstants.IMPROPER_USER_REQUEST_APP);
	}
}