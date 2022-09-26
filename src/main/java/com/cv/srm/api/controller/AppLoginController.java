package com.cv.srm.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cv.srm.api.request.AuthenticationParams;
import com.cv.srm.api.request.AuthenticationRequest;
import com.cv.srm.api.request.base.BaseRequest;
import com.cv.srm.api.response.AuthenticationResponse;
import com.cv.srm.api.response.base.ApiResponse;
import com.cv.srm.api.response.base.BaseResponse;
import com.cv.srm.api.response.result.AuthenticationResult;
import com.cv.srm.constants.SuccessMessageConstants;
import com.cv.srm.enums.ExceptionCodes;
import com.cv.srm.exception.RnRTrackerException;
import com.cv.srm.service.LoginService;
import com.cv.srm.util.AppUtils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/v1/api/login")
public class AppLoginController {

	@Autowired
	LoginService loginService;

	
	@PostMapping(value = "/authenticate", produces = MediaType.APPLICATION_JSON_VALUE , consumes = MediaType.APPLICATION_JSON_VALUE)
	public ApiResponse<AuthenticationResponse> login(@RequestBody AuthenticationRequest authRequest) {

		ApiResponse<AuthenticationResponse> apiResponse = new ApiResponse<>();

		AuthenticationResponse authResponse = new AuthenticationResponse();
		BaseResponse<AuthenticationResult> baseResponse = new BaseResponse<>();
		AuthenticationResult authResult = new AuthenticationResult();

		baseResponse.setResult(authResult);
		authResponse.setResponse(baseResponse);

		if (authRequest != null) {
			BaseRequest<AuthenticationParams> baseRequest = authRequest.getRequest();
			if (baseRequest != null) {

				baseResponse.populateType(baseRequest);
				// baseResponse.setType(RequestTypes.LOGIN.getValue());

				AuthenticationParams authParams = baseRequest.getParameters();
				if (authParams != null) {
					String email = authParams.getEmail();
					String password = authParams.getPassword();

					if (AppUtils.isNotBlankOrNullString(email) && AppUtils.isNotBlankOrNullString(password)) {
						try {
							authResult = loginService.authenticate(email, password);

							//Setting authresult into baseResponse once again because service method return new object.
							baseResponse.setResult(authResult);
							baseResponse.setSuccess(true);
							baseResponse.populateHttpStatusCdAndMsg(HttpStatus.OK);
							baseResponse.populateSuccessDisplayMsgForPortalAndApp(
									SuccessMessageConstants.SUCCESS_LOGIN_PORTAL,
									SuccessMessageConstants.SUCCESS_LOGIN_APP);
							log.info("Login Successful for user with email :: "+email);

						} catch (RnRTrackerException iex) {
							if (iex.getExceptionCode() != null) {
								if (iex.getExceptionCode().equals(ExceptionCodes.INVALID_USERNAME_PASSWORD)) {
									log.info("Invalid username or password for :: "+email);
									authResponse.populateInvalidCredentialsErrorMsg();
								} else {
									log.info("Internal Server error while login for :: "+email);
									baseResponse.populateServerError();
								}

							} else {
								log.info("Internal Server error while login for :: "+email);
								baseResponse.populateServerError();
							}
						}
					} else {
						log.info("Missing required field while login for :: "+email);
						authResponse.populateMissingFieldErrorMsg();
					}
				} else {
					log.info("Missing required field for login ");
					authResponse.populateMissingFieldErrorMsg();
				}
			} else {
				log.info( "Invalid request format for login ");
				baseResponse.populateInvalidRequestFormatErrorMsg();
			}
		} else {
			log.info( "Invalid request format for login ");
			baseResponse.populateInvalidRequestFormatErrorMsg();
		}

		apiResponse.setPayload(authResponse);

		return apiResponse;
	}
}
