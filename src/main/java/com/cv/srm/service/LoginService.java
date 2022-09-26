package com.cv.srm.service;

import com.cv.srm.api.response.result.AuthenticationResult;
import com.cv.srm.exception.RnRTrackerException;

public interface LoginService {

	AuthenticationResult authenticate(String email, String password) throws RnRTrackerException;
}
