package com.cv.srm.api.response;

import java.io.Serializable;

import org.springframework.http.HttpStatus;

import com.cv.srm.api.response.base.BaseResponse;
import com.cv.srm.api.response.result.AuthenticationResult;
import com.cv.srm.constants.ErrorMessageConstants;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "response" })
public class AuthenticationResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8076409307397802241L;

	@JsonProperty("response")
	private BaseResponse<AuthenticationResult> response;

	public BaseResponse<AuthenticationResult> getResponse() {
		return response;
	}

	public void setResponse(BaseResponse<AuthenticationResult> response) {
		this.response = response;
	}

	public void populateMissingFieldErrorMsg() {
		if (this.response != null) {
			this.response.setSuccess(false);
			this.response.populateHttpStatusCdAndMsg(HttpStatus.BAD_REQUEST);
			this.response.setDisplayPortalMsg("Email / password " + ErrorMessageConstants.REQUIRED_FIELD_PORTAL);
			this.response.setDisplayAppMsg("Email / password " + ErrorMessageConstants.REQUIRED_FIELD_APP);
		}
	}

	public void populateInvalidCredentialsErrorMsg() {
		if (this.response != null) {
			this.response.setSuccess(false);
			this.response.populateHttpStatusCdAndMsg(HttpStatus.BAD_REQUEST);
			this.response.setDisplayPortalMsg(ErrorMessageConstants.INVALID_LOGIN_CREDENTIAL_PORTAL);
			this.response.setDisplayAppMsg(ErrorMessageConstants.INVALID_LOGIN_CREDENTIAL_APP);
		}
	}
	
	public void populateTokenExpireOrInvalidErrorMsg() {
		if (this.response != null) {
			this.response.setSuccess(false);
			this.response.populateHttpStatusCdAndMsg(HttpStatus.BAD_REQUEST);
			this.response.setDisplayPortalMsg(ErrorMessageConstants.INVALID_OR_EXPIRE_AUTH_TOKEN_PORTAL);
			this.response.setDisplayAppMsg(ErrorMessageConstants.INVALID_OR_EXPIRE_AUTH_TOKEN_APP);
		}
	}
}
