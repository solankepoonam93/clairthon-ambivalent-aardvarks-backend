package com.cv.srm.constants;

/**
 * This is app constants class which contain constant variables.
 *
 * @author Mir Zahid Ali
 *
 */
public class AppConstants {

	/**
	 * Class contractor
	 */
	private AppConstants() {
	}

	//app is secure
	public static final String  APP_IS_SECURE = "app.is.secure";
	//Account specific tokens 
	public static final int ACCOUNT_ID_LENGHT = 8;
	//Authorization Token specific Constants 
	public static final String AUTHORIZATION_TOKEN_HEADER_NAME = "Authorization";
	//Authorization Token Prefix
	public static final String AUTHORIZATION_TOKEN_PREFIX = "Bearer ";
	public static final String AUTHORIZATION_BASIC_TOKEN_PREFIX = "Basic ";
	//Token Claims specific Constants
	public static final String CLAIM_TOKEN_USER_ID = "userId";
	//Token Client ID
	public static final String CLAIM_TOKEN_CLIENT_ID = "clientId";
	//Token Authorities
	public static final String CLAIM_TOKEN_AUTHORITIES = "authorities";
	//Add Entity in DB specific constants
	public static final String SYSTEM_USER = "SYSTEM";
	//Email constants
	public static final String MAIL_FORGET_PASSWORD_SUBJECT = "Reset Email";
	//Common codes variables
	public static final String EQUAL = "=";
	public static final String QUESTION = "?";
	public static final String AMPERSAND = "&";
	public static final String CURLY_BRACKET_OPEN = "{";
	public static final String CURLY_BRACKET_CLOSE = "}";
	public static final String COLON = ":";
	public static final String DOUBLE_QUOTE = "\"";
	public static final String COMMA = ",";
	public static final String Y_FLAG = "Y";
	public static final String N_FLAG = "N";
	public static final String TRUE_FLAG = "TRUE";
	public static final String FALSE_FLAG = "FALSE";
	public static final String NULL_STRING = "null";
	public static final String EMPTY_STRING = "";
	public static final String PIPE_STRING = "\\|";
	public static final String BACKWARD_SLASH = "\\";
	public static final String FORWARD_SLASH = "/";
	public static final String TILDE_STRING="~";
	public static final String SPACE=" ";
	public static final String DOT=".";
	public static final String HTTP_PROTOCOL="http://";
	public static final String HTTPS_PROTOCOL="https://";
	
	/* Full App Constants .. */
	// TheSIS header Keys
	public static final String THESIS_REQUEST_HEADER_KEY_AUTHCODE="accessToken";
	public static final String THESIS_REQUEST_HEADER_KEY_X_TRANSACTION_ID="x-transactionId";
	
	//Answer Codes
	public static final String ANSWER_CD_FIRST_NM = "A_FIRSTNAME";
	public static final String ANSWER_CD_MIDDLE_NM = "A_MIDDLENAME";
	public static final String ANSWER_CD_LAST_NM = "A_LASTNAME";
	public static final String ANSWER_CD_HS_GPA = "A_HS_GPA_VAL";
	public static final String ANSWER_CD_HS_GPA_TYPE = "A_HS_GPA_TYPE";
	public static final String ANSWER_CD_COLLEGE_GPA = "A_COLLEGE_GPA";
	public static final String ANSWER_CD_F1_VISA = "A_F1_VISA";
	public static final String ANSWER_CD_DACA = "A_DACA";
	
	//CRM, CVue constants
	
	/* CRM Student Search constants  */
	public static final String CVUE_SERVICE_NAME_CRM_STUDENT_SEARCH="CRM student search";
	public static final String CRM_STUDENT_SEARCH_PARAM_STUDENT_NUMBER = "StudentNumber";
	public static final String CRM_STUDENT_SEARCH_PARAM_DEFAULT_STUDENT_NUMBER = "-1";
	public static final String CRM_STUDENT_SEARCH_PARAM_STUDENT_ID = "StudentId";
	public static final String CRM_STUDENT_SEARCH_PARAM_DEFAULT_STUDENT_ID = "-1";
	public static final String CRM_STUDENT_SEARCH_FIELD_COUNTRY_OF_CITIZENSHIP_US = "United States";
	public static final String CRM_STUDENT_RECORD_TYPE_STUDENT = "student";
	
	/* Student Program constants  */
	public static final String CVUE_SERVICE_NAME_STUDENT_PROGRAM="Student Program";
	public static final String STUDENT_PROGRAM_PARAM_STUDENT_ID = "StudentId";
	public static final String STUDENT_PROGRAM_PARAM_DEFAULT_STUDENT_ID = "-1";
	public static final String STUDENT_PROGRAM_ACTIVE_ENROLLMENT_CODES = "ATT,CA";
	public static final String STUDENT_PROGRAM_CAMPUS_CODE_TRAD = "TRAD";
	public static final String STUDENT_PROGRAM_CAMPUS_CODE_NON_TRAD = "NON TRAD";
	
	/* Student Gender constants  */
	public static final String STUDENT_GENDER_MALE = "Male";
	public static final String STUDENT_GENDER_FEMALE = "Female";
	
	/* Student Previous Education constants */
	public static final String CVUE_SERVICE_NAME_STUDENT_PREVIOUS_EDUCATION="Student Previous Education";
	public static final String STUDENT_PREVIOUS_EDUCATION_PARAM_ENROLLMENT_ID = "AdEnrollID";
	public static final String STUDENT_PREVIOUS_EDUCATION_PARAM_DEFAULT_ENROLLMENT_ID = "-1";
	
	/* for question Please enter your college transfer credits - take either of them whichever is higher  */
	public static final String STUDENT_PREVIOUS_EDUCATION_CUSTOM_UNOFFICIAL_COLLEGE_CREDIT = "Unofficial College Credits";
	public static final String STUDENT_PREVIOUS_EDUCATION_CUSTOM_FIELD_CREDIT_OUTSIDE_GCU = "Credits Outside GCU";
	
	/* GCU GPA shows only if 1 semester is completed. So consider their wtd HS GPA (GCU GPA trumps this). */
	public static final String STUDENT_PREVIOUS_EDUCATION_CUSTOM_COLLEGE_GPA = "Unofficial College GPA";
	
	public static final String STUDENT_PREVIOUS_EDUCATION_CUSTOM_FIELD_HS_UNOFFICIAL_GPA = "HS Unofficial GPA";
	public static final String STUDENT_PREVIOUS_EDUCATION_CUSTOM_FIELD_WEIGHTED_HS_GPA = "Weighted HS GPA";
	public static final String STUDENT_PREVIOUS_EDUCATION_CUSTOM_FIELD_SIXTH_SEMESTER_GPA = "6th Semester GPA";
	public static final String STUDENT_PREVIOUS_EDUCATION_ACT_DESC="ACT Composite";
	public static final String STUDENT_PREVIOUS_EDUCATION_SAT_DESC="SAT Composite";
	
	/* CVue data mapping to dynamic question constants */
	public static final String CVUE_DATA_DEGREE_LEVEL = "CVUE_DATA_DEGREE_LEVEL";
	public static final String CVUE_DATA_ATTENDANCE_TYPE = "CVUE_DATA_ATTENDANCE_TYPE";
	public static final String CVUE_DATA_AREA_OF_STUDY_INTEREST = "CVUE_DATA_AREA_OF_STUDY_INTEREST";
	public static final String CVUE_DATA_CURRENT_EDUCATION_LEVEL = "CVUE_DATA_CURRENT_EDUCATION_LEVEL";
	public static final String CVUE_DATA_HS_GRADUATION_YEAR = "CVUE_DATA_HS_GRADUATION_YEAR";
	public static final String CVUE_DATA_HS_GRADUATION_MONTH = "CVUE_DATA_HS_GRADUATION_MONTH";
	public static final String CVUE_DATA_HS_NAME = "CVUE_DATA_HS_NAME";
	public static final String CVUE_DATA_HS_DETAIL = "CVUE_DATA_HS_DETAIL";
	public static final String CVUE_DATA_NON_US_CREDIT = "CVUE_DATA_NON_US_CREDIT";
	public static final String CVUE_DATA_MILITARY = "CVUE_DATA_MILITARY";
	public static final String CVUE_DATA_US_CITIZEN = "CVUE_DATA_US_CITIZEN";
	public static final String CVUE_DATA_FIRST_NAME = "CVUE_DATA_FIRST_NAME";
	public static final String CVUE_DATA_LAST_NAME = "CVUE_DATA_LAST_NAME";
	public static final String CVUE_DATA_MIDDLE_NAME = "CVUE_DATA_MIDDLE_NAME";
	public static final String CVUE_DATA_COUNTRY_CD = "CVUE_DATA_COUNTRY_CD";
	public static final String CVUE_DATA_PHONE = "CVUE_DATA_PHONE";
	public static final String CVUE_DATA_EMAIL = "CVUE_DATA_EMAIL";
	public static final String CVUE_DATA_ZIPCODE = "CVUE_DATA_ZIPCODE";
	public static final String CVUE_DATA_AGE = "CVUE_DATA_AGE";
	public static final String CVUE_DATA_AZ_RESIDENT = "CVUE_DATA_AZ_RESIDENT";
	public static final String CVUE_DATA_LIVE_ON_CAMPUS = "CVUE_DATA_LIVE_ON_CAMPUS";
	public static final String CVUE_DATA_F1_VISA = "CVUE_DATA_F1_VISA";
	public static final String CVUE_DATA_DACA = "CVUE_DATA_DACA";
	public static final String CVUE_DATA_ANTICIPATED_YEAR = "CVUE_DATA_ANTICIPATED_YEAR";
	public static final String CVUE_DATA_COLLEGE_TRANSFER_CREDIT = "CVUE_DATA_COLLEGE_TRANSFER_CREDIT";
	public static final String CVUE_DATA_HS_GPA_TYPE = "CVUE_DATA_HS_GPA_TYPE";
	public static final String CVUE_DATA_HS_GPA_VAL = "CVUE_DATA_HS_GPA_VAL";
	public static final String CVUE_DATA_SAT = "CVUE_DATA_SAT";
	public static final String CVUE_DATA_ACT = "CVUE_DATA_ACT";
	public static final String CVUE_DATA_COLLEGE_TRANSFER_GPA = "CVUE_DATA_COLLEGE_TRANSFER_GPA";
	public static final String CVUE_DATA_FULL_TIME = "CVUE_DATA_FULL_TIME";
	public static final String CVUE_DATA_HISPANIC = "CVUE_DATA_HISPANIC";
	public static final String CVUE_DATA_RACE_ETHINICITY = "CVUE_DATA_RACE_ETHINICITY";
	public static final String CVUE_DATA_SEX = "CVUE_DATA_SEX";
	
	
	//Internal Scholarship backend 
	public static final String STUDENT_VISA_AND_DACA_STATU_SSERVICE = "StudentVisaAndDacaStatusService";
	public static final String STUDENTID = "studentId";
	
	// Max Error message length to store exception stack of Review flow
	public static final Integer REVIEW_ERROR_MAX_MSG_LENGTH=490;
	
	
	// Scholarship specific properties
	public static final String SCHOLARSHIP_START_END_DATE_FORMAT = "MMM dd, yyyy";
	public static final String APPLICATION_ALLOW_ACCESS_DATE_FORMAT = "MM-dd-yyyy HH:mm:ss";
	
	// Filebound Attachment specific properties
	public static final String FILE_TYPE_PDF="pdf";
	public static final String FILE_TYPE_GIF="gif";
	public static final String FILE_TYPE_JPEG="jpeg";
	public static final String FILE_TYPE_PNG="png";
	public static final String FILE_TYPE_HTML="html";
	public static final String FILE_TYPE_HTM="htm";
	public static final String FILE_TYPE_TXT="txt";
	
	//Security - Auth specific constants
	public static final String AUTH_USER_ROLE_NAME = "USER";
	
	// Enrollment specific codes
	public static final String NO_ENROLLMENT_FOUND_IN_CVUE = "NO_ENROLLMENT_IN_CVUE";
	
	// Cvue Nexus header Keys
	public static final String CVUE_NEXUS_HEADER_AUTHORIZATION="Authorization";
	
	// Cvue Service Names
	public static final String CVUE_NEXUS_SERVICE_NAME_STUDENT_SUMMARY_INFO = "Student Summary Info";
	public static final String CVUE_NEXUS_SERVICE_NAME_STUDENT_ENROLLMENT = "Student Enrollments For Ledgers";
	
}
