package com.cv.srm.constants;

public final class ErrorMessageConstants {

	private ErrorMessageConstants() {
		
	}
	
	public static final String SERVER_ERROR_PORTAL ="Operation failed. Please contact system administrator with Token: ";
	public static final String SERVER_ERROR_APP ="Operation failed. Please contact system administrator";
	
	public static final String DUPLICATE_ERROR = " already exists.";
	
	public static final String REQUIRED_FIELD_APP = " is required";
	public static final String REQUIRED_FIELD_PORTAL = " is required";
	
	public static final String REQUIRED_GENERAL_MISSING_INFORMATION_MSG = "Missing required information";
	
	public static final String IMPROPER_USER_REQUEST_PORTAL = "Input request format is not proper.";
	public static final String IMPROPER_USER_REQUEST_APP = "Input request format is not proper.";
	
	public static final String INVALID_OR_EXPIRE_AUTH_TOKEN_PORTAL = "Auth tocken is either invalid or expired";
	public static final String INVALID_OR_EXPIRE_AUTH_TOKEN_APP = "Auth tocken is either invalid or expired";
	
	public static final String INVALID_LOGIN_CREDENTIAL_PORTAL = "Email or Password is incorrect.";
	public static final String INVALID_LOGIN_CREDENTIAL_APP = "Email or Password is incorrect.";
	
	
	/* Account START */
	
	public static final String CREATE_ACCOUNT_USER_EXIST_PORTAL = "User exist with this email.";
	public static final String CREATE_ACCOUNT_USER_EXIST_APP = "User exist with this email.";
	
	/* Account END */
	
	/* Hotel START */
	
	public static final String CREATE_HOTEL_USER_NOT_EXIST_PORTAL = "User does not exist ";
	public static final String CREATE_HOTEL_USER_NOT_EXIST_APP = "User does not exist ";
	
	public static final String LIST_HOTEL_USER_NOT_EXIST_PORTAL = "User does not exist ";
	public static final String LIST_HOTEL_USER_NOT_EXIST_APP = "User does not exist ";
	
	/* Hotel END */
	
	/* Forget Password START */
	
	public static final String FORGET_PASSWORD_CREATE_TOKEN_NO_USE_EXIST_PORTAL = "No user exist with this email.";
	public static final String FORGET_PASSWORD_CREATE_TOKEN_NO_USE_EXIST_APP = "No user exist with this email.";
	
	public static final String FORGET_PASSWORD_RESET_PASSWORD_TOKEN_EXPIRED_PORTAL = "Reset Password link is expired.";
	public static final String FORGET_PASSWORD_RESET_PASSWORD_TOKEN_EXPIRED_APP = "Reset Password link is expired.";
	
	public static final String FORGET_PASSWORD_RESET_PASSWORD_TOKEN_INVALID_PORTAL = "Reset Password link is invalid.";
	public static final String FORGET_PASSWORD_RESET_PASSWORD_TOKEN_INVALID_APP = "Reset Password link is invalid.";
	
	/* Forget Password END */
	
	/* Device START */

	public static final String ADD_DEVICE_MISSING_INPUT_PORTAL = "Invalid input data format";
	public static final String ADD_DEVICE_MISSING_INPUT_APP = "Invalid input data format";
	
	public static final String ADD_DEVICE_USER_NOT_EXIST_PORTAL = "User does not exist ";
	public static final String ADD_DEVICE_USER_NOT_EXIST_APP = "User does not exist ";

	public static final String PERFORM_OPERATION_USER_NOT_EXIST_PORTAL = "User does not exist ";
	public static final String PERFORM_OPERATION_USER_NOT_EXIST_APP = "User does not exist ";

	public static final String MASTER_CARD_USER_NOT_EXIST_PORTAL = "User does not exist ";
	public static final String MASTER_CARD_USER_NOT_EXIST_APP = "User does not exist ";
	
	public static final String DEVICE_ROLE_TYPE_INVALID_SERIAL_PORTAL = "Device SerialNo is invalid.";
	public static final String DEVICE_ROLE_TYPE_INVALID_SERIAL_APP = "Device SerialNo is invalid.";
	
	public static final String ADD_DEVICE_EXCEL_UPLOAD_ERROR_PORTAL = "Error occurred while uploading device list due to improper format.";
	public static final String ADD_DEVICE_EXCEL_UPLOAD_ERROR_APP = "Error occurred while uploading device list due to improper format.";
	
	public static final String LIST_DEVICE_HOTEL_NOT_EXIST_PORTAL = "No hotel is selected to fetch the device list";
	public static final String LIST_DEVICE_HOTEL_NOT_EXIST_APP = "No hotel is selected to fetch the device list";

	public static final String LIST_USER_HOTEL_NOT_EXIST_PORTAL = "No hotel is selected to fetch the user list";
	public static final String LIST_USER_HOTEL_NOT_EXIST_APP = "No hotel is selected to fetch the user list";

	public static final String LIST_ALLOCATED_ROOM_HOTEL_NOT_EXIST_PORTAL = "No hotel is selected to fetch the allocated rooms list";
	public static final String LIST_ALLOCATED_ROOM_HOTEL_NOT_EXIST_APP = "No hotel is selected to fetch the allocated rooms list";

	/* Device END */

	/* Staff START */

	public static final String LIST_STAFF_CARD_USER_NOT_EXIST_PORTAL = "Staff card User does not exist ";
	public static final String LIST_STAFF_CARD_USER_NOT_EXIST_APP = "Staff card User does not exist ";

	public static final String LIST_STAFF_CODE_USER_NOT_EXIST_PORTAL = "Staff code User does not exist ";
	public static final String LIST_STAFF_CODE_USER_NOT_EXIST_APP = "Staff code User does not exist ";

	/* Staff END */

	/* Pending START */

	public static final String ROOM_ALLOCATION_PENDING_PORTAL = "Room allocation pending because device is not connected";
	public static final String ROOM_ALLOCATION_PENDING_APP = "Room allocation pending because device is not connected";

	public static final String STAFF_INFO_PENDING_PORTAL = "Staff info creation pending because device is not connected";
	public static final String STAFF_INFO_PENDING_APP = "Staff info creation pending because device is not connected";

	/* Pending END */
}
