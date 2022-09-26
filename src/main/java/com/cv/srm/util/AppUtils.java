package com.cv.srm.util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.springframework.util.StringUtils;

import com.cv.srm.constants.AppConstants;

public class AppUtils {

	private AppUtils() {

	}

	private static Random random = new Random();

	public static boolean isTrue(String pValue) {
		if (StringUtils.hasText(pValue) && pValue.trim().equalsIgnoreCase(AppConstants.Y_FLAG)) {
			return true;
		}
		return false;
	}

	public static boolean isFalse(String pValue) {
		if (StringUtils.hasText(pValue) && pValue.trim().equalsIgnoreCase(AppConstants.N_FLAG)) {
			return true;
		}
		return false;
	}

	public static long generateUniqueTokenForLog() {
		Calendar calendar = Calendar.getInstance();
		long tokenValue = calendar.getTimeInMillis();
		int randomValue = random.nextInt(1000000);
		return (tokenValue + randomValue);
	}

	public static boolean isNotBlankOrNullString(String pValue) {
		boolean nonEmptyString = false;
		if (StringUtils.hasText(pValue) && !pValue.trim().equalsIgnoreCase(AppConstants.NULL_STRING)) {
			nonEmptyString = true;
		}
		return nonEmptyString;
	}

	public static boolean isBlankOrNullString(String pValue) {
		boolean emptyString = false;
		if (!StringUtils.hasText(pValue) || pValue.trim().equalsIgnoreCase(AppConstants.NULL_STRING)) {
			emptyString = true;
		}
		return emptyString;
	}

	public static boolean isBlankOrNullCol(final Collection<?> coll) {
		return coll == null || coll.isEmpty();
	}

	public static boolean isNotBlankOrNullCol(final Collection<?> coll) {
		return !isBlankOrNullCol(coll);
	}

	public static boolean isBlankOrNullMap(final Map<?,?> map) {
		return map == null || map.isEmpty();
	}

	public static boolean isNotBlankOrNullMap(final Map<?,?> map) {
		return !isBlankOrNullMap(map);
	}
	
	public static String dateToMilliSecStr(Date date) {
		String retString = AppConstants.EMPTY_STRING;
		if (date != null) {
			retString = String.valueOf(date.getTime());
		}
		return retString;
	}

	public static String getTwoPrecisionBigDecimalStr(BigDecimal bigDecimal) {
		String retString = AppConstants.EMPTY_STRING;
		if (bigDecimal != null) {
			bigDecimal = bigDecimal.setScale(2, RoundingMode.HALF_UP);
			retString = bigDecimal.toString();
		}
		return retString;
	}

	public static String getStrOfNumber(Number value) {
		String retString = AppConstants.EMPTY_STRING;
		if (value != null) {
			retString = value.toString();
		}
		return retString;
	}

	public static Integer getIntFromString(String value) {
		Integer returnVal = null;
		if (isNotBlankOrNullString(value)) {
			try {
				Integer.parseInt(value);
			} catch (NumberFormatException nfe) {
				nfe.printStackTrace();
			}
		}
		return returnVal;
	}

	public static String resolveToken(HttpServletRequest req) {
		String bearerToken = req.getHeader("Authorization");
		if (AppUtils.isNotBlankOrNullString(bearerToken) && bearerToken.startsWith("Bearer ")) {
			return bearerToken.substring(7);
		}
		return null;
	}

	public static String base64Encode(String strValue) {
		String encodedValue = null;
		if (AppUtils.isNotBlankOrNullString(strValue)) {
			encodedValue = Base64.getEncoder().encodeToString(strValue.getBytes());
		}
		return encodedValue;
	}

	public static String base64Encode(byte[] byteValue) {
		String encodedValue = null;
		if (byteValue != null && byteValue.length > 0) {
			encodedValue = Base64.getEncoder().encodeToString(byteValue);
		}
		return encodedValue;
	}

	public static byte[] base64Decode(String strValue) {
		byte[] decodedValue = null;
		if (AppUtils.isNotBlankOrNullString(strValue)) {
			decodedValue = base64Decode(strValue.getBytes(StandardCharsets.UTF_8));
		}
		return decodedValue;
	}

	public static byte[] base64Decode(byte[] byteValue) {
		byte[] decodedValue = null;
		if (byteValue != null && byteValue.length > 0) {
			decodedValue = Base64.getDecoder().decode(byteValue);
		}
		return decodedValue;
	}

	public static String byteToHex(byte num) {
		char[] hexDigits = new char[2];
		hexDigits[0] = Character.forDigit((num >> 4) & 0xF, 16);
		hexDigits[1] = Character.forDigit((num & 0xF), 16);
		return new String(hexDigits);
	}

	public static byte hexToByte(String hexString) {
		int firstDigit = toDigit(hexString.charAt(0));
		int secondDigit = toDigit(hexString.charAt(1));
		return (byte) ((firstDigit << 4) + secondDigit);
	}

	public static int toDigit(char hexChar) {
		int digit = Character.digit(hexChar, 16);
		if (digit == -1) {
			throw new IllegalArgumentException("Invalid Hexadecimal Character: " + hexChar);
		}
		return digit;
	}

	/**
	 * This method returns boolean value from given String
	 * 
	 * @param value
	 * @return true or false - boolean
	 */
	public static boolean getBooleanVal(String value) {
		boolean retValue = false;
		if (AppUtils.isNotBlankOrNullString(value)) {
			retValue = Boolean.parseBoolean(value);
		}
		return retValue;
	}

	/**
	 * This method return current date
	 * 
	 * @return current Date
	 */
	public static Date getCurrentDate() {
		return new Date();
	}

}
