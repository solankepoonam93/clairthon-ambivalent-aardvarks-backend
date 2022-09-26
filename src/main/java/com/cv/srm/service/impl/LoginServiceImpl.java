package com.cv.srm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

import com.cv.srm.api.response.result.AuthenticationResult;
import com.cv.srm.configuration.JwtTokenProvider;
import com.cv.srm.enums.ExceptionCodes;
import com.cv.srm.exception.RnRTrackerException;
import com.cv.srm.model.User;
import com.cv.srm.repository.UserRepository;
import com.cv.srm.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private JwtTokenProvider jwtTokenProvider;

	@Autowired
	private AuthenticationManager authenticationManager;

	@Override
	public AuthenticationResult authenticate(String email, String password) throws RnRTrackerException {
		String jwtToken = null;
		AuthenticationResult authResult = new AuthenticationResult();
		User appUser = userRepository.findByEmail(email);
		try {
			// Step 1: This is Admin user most of the case.
			UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = null;
			usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(email, password);
			authenticationManager.authenticate(usernamePasswordAuthenticationToken);
			jwtToken = jwtTokenProvider.createToken(appUser);

			// Set normal user detail
			authResult.setAuthToken(jwtToken);
			authResult.setName(appUser.getName());
			authResult.setUserId(appUser.getId());
		} catch (Exception ex) {
			throw new RnRTrackerException(ExceptionCodes.INVALID_USERNAME_PASSWORD, ex, HttpStatus.UNAUTHORIZED);
		}
		return authResult;
	}

}
