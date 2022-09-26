package com.cv.srm.constants;

/**
 * This class contains DB specific constants
 * @author nilang
 *
 */
public class DBConstants {

	private DBConstants() {
		
	}
	
	public static final String SCHEMA_NAME = "btQ";
	public static final String STORED_PROCEDURE_NM_BTQ_CREATE_MSG = "CreateMessage";
	
	public static final String PARAM_BTQ_SP_MSG_TYPE = "messageType";
	public static final String PARAM_BTQ_SP_PAYLOAD = "payload";
	public static final String PARAM_BTQ_SP_CREATEDBY = "createdBy";
	
	/* Donor Scholarship specific DB constants */
	public static final String DONOR_SCHOLARSHIP_PROPERTY_SUB_GRP_NAME = "DONORSCHOLARSHIPMAIN";
	public static final String DONOR_SCHOLARSHIP_PROPERTY_APPLICATION_ALLOW_DATE_RANGE = "application.allow.access.daterange";
	public static final String DONOR_SCHOLARSHIP_RESTRICT_ACCESS_BYPASS_DOC_PAGE = "restrict.access.bypass.document.page";
	public static final String DONOR_SCHOLARSHIP_PROPERTY_NOT_ALLOWED_ENROLLMENTS = "donorscholarship.not.allowed.enrollments";
	public static final String DONOR_SCHOLARSHIP_PROPERTY_ALLOWED_TRANSFER_ENROLLMENTS = "donorscholarship.allowed.transfer.enrollments";
	
	public static final String DONOR_SCHOLARSHIP_PROPERTY_ESTIMATOR_EMAIL_GRP_NAME = "ESTIMATOREMAIL";
	public static final String DONOR_SCHOLARSHIP_PROPERTY_ACADEMIC_YEAR_KEY = "estimator.academic.year";
	public static final String DONOR_SCHOLARSHIP_PROPERTY_ATTACH_FILE_NAME_KEY = "estimator.attach.file.name";
	public static final String DONOR_SCHOLARSHIP_PROPERTY_EMAIL_SUBJECT_KEY = "estimator.email.subject";
	public static final String DONOR_SCHOLARSHIP_PROPERTY_FROM_EMAIL_ID_KEY = "estimator.from.email.id";
	public static final String DONOR_SCHOLARSHIP_PROPERTY_REFER_CVUE_FOR_F1VISA_AND_DACA = "f1.visa.fromCvue";
	public static final String DONOR_SCHOLARSHIP_PROPERTY_ALLOWED_ENROLLMENTS = "donorscholarship.allowed.enrollments";
	
	/* Dynamic Question related constants  */
	
	/* Application Screen codes */
	public static final String APP_SCREEN_CD_DEFAULT = "TLABTYRSL";
	public static final String APP_SCREEN_CD_GETTING_STARTED = "GTNSTRTD";
	public static final String APP_SCREEN_CD_TELL_ABOUT_YOURSELF = "TLABTYRSL";
	public static final String APP_SCREEN_CD_DEMOGRAPHICS = "DMGRPHS";
	public static final String APP_SCREEN_CD_TELL_US_MORE = "TELLUSMR";
	public static final String APP_SCREEN_CD_ELIGIBLE_SCHOLARSHIP = "ELGBLSCHLRSHP";
	public static final String APP_SCREEN_CD_SCHOLARSHIP_DOCUMENTS = "DOCMNTS";
	
	/* Student Application status */
	public static final String STUDENT_APP_STATUS_NEW ="NEW";
	public static final String STUDENT_APP_STATUS_IN_PROGRESS ="IN_PROGRESS";
	public static final String STUDENT_APP_STATUS_PARTIAL_SUBMITTED ="PARTIAL_SUBMITTED";
	public static final String STUDENT_APP_STATUS_SUBMITTED ="SUBMITTED";
	
	
	/* Student Scholarship status */
	public static final String STUDENT_SCHOLARSHIP_STATUS_NOT_STARTED ="NOT_STARTED";
	public static final String STUDENT_SCHOLARSHIP_STATUS_IN_PROGRESS ="IN_PROGRESS";
	public static final String STUDENT_SCHOLARSHIP_STATUS_SUBMITTED ="SUBMITTED";
	
	/* Answer Value Type */
	public static final String ANSWER_VALUE_TYPE_NUMBER_CD = "NUMBER";
	public static final String ANSWER_VALUE_TYPE_DECIMAL_CD = "DECIMAL";
	public static final String ANSWER_VALUE_TYPE_STRING_CD = "STRING";
	public static final String ANSWER_VALUE_TYPE_BOOLEAN_CD = "BOOLEAN";
	
	
	/* Scholarship action */
	public static final String SCHOLARSHIP_SUBMITTED_ACTION_SAVE = "SAVE";
	public static final String SCHOLARSHIP_SUBMITTED_ACTION_SUBMIT = "SUBMIT";
	public static final String SCHOLARSHIP_SUBMITTED_ACTION_CANCEL = "CANCEL";
	
}
