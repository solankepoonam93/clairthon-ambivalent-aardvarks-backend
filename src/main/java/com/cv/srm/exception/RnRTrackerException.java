package com.cv.srm.exception;

import org.springframework.http.HttpStatus;

import com.cv.srm.constants.AppConstants;
import com.cv.srm.enums.ExceptionCodes;

public class RnRTrackerException extends Exception {

	private static final long serialVersionUID = 1L;

	private final HttpStatus httpStatus;
	private final Throwable originalException;
	private final ExceptionCodes exceptionCode;

	public RnRTrackerException(ExceptionCodes exceptionCode, Throwable originalException, HttpStatus httpStatus) {
		super(originalException);
		this.exceptionCode = exceptionCode;
		this.originalException = originalException;
		this.httpStatus = httpStatus;
	}

	@Override
	public String getMessage() {
		if(originalException !=null) {
			return originalException.getMessage();
		}else {
			return AppConstants.EMPTY_STRING;
		}
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public Throwable getOriginalException() {
		return originalException;
	}

	public ExceptionCodes getExceptionCode() {
		return exceptionCode;
	}

}
