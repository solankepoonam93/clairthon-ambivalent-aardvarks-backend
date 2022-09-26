package com.cv.srm.enums;

public enum ExceptionCodes {

	INVALID_USERNAME_PASSWORD(101,"Invalid username/password supplied"),
	INVALID_EXPIRED_TOKEN(102,"Expired or invalid auth token"),
	USER_DOESNOT_BELONGS_TO_CLIENT(103,"User doesn't belongs to Client"),
	ACCOUNT_EXIST_WITH_EMAIL(104,"Account exist for given email Id"),
	RESERVATION_UNKNOWN_ERROR(112,"Reservation was unable to be created, unknown error"),
	ACCOUNT_DOES_NOT_EXIST_WITH_EMAIL(105,"Account does not exist for given email Id"),
	INTERNAL_SERVER_ERROR(106,"Internal Server Error"),
	FORGET_PASSWORD_TOKEN_EXPIRED(107,"Forget password token is expired"),
	FORGET_PASSWORD_TOKEN_INVALID(108,"Forget password token is invalid"),
	NO_USER_FOUND(109,"No user found"),
	INVALID_DEVICE_NUMBER(110," Device Number is not valid"),
	NO_HOTEL_SELECTED_FOR_DEVICE_LIST(111," No hotel is selected to fetch device list"),
	NO_HOTEL_SELECTED_FOR_USER_LIST(111," No hotel is selected to fetch user list"),
	NO_HOTEL_SELECTED_FOR_ALLOCATED_ROOMS_LIST(111," No hotel is selected to fetch allocated rooms list");
	
	ExceptionCodes(int code, String message){
		this.Code = code;
		this.message = message;
	}
	
	private int Code;
	private String message;
	
	public int getCode() {
		return Code;
	}
	public void setCode(int code) {
		Code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
