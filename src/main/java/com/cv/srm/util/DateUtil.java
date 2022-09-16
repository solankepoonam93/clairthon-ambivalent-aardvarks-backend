package com.cv.srm.util;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

public class DateUtil {

    public static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public static ZonedDateTime getUTCZonedDateTime() {
        return ZonedDateTime.ofInstant(Instant.now(), ZoneId.of("UTC"));
    }

    /**
     * method is uses to format the date.
    */
    public static String getFormattedDate() {
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        return sdf.format(new Date());
    }

    public static ZonedDateTime getZonedDateTime(String timeZone) {
        return ZonedDateTime.ofInstant(Instant.now(), ZoneId.of(timeZone.toUpperCase()));
    }

    public static ZonedDateTime getZonedDateFromString(String stringDate) {
        DateTimeFormatter parser = DateTimeFormatter.ofPattern(DATE_FORMAT);
        return ZonedDateTime.parse(stringDate, parser.withZone(ZoneId.of("UTC")));
    }

    /**
     * Method to convert zoned date time to string.
     *
     * @param zonedDateTime - date time in ZonedDateTime
     * @return - ZonedDateTime in string format
     */
    public static String getDateStringFromZonedDateTime(ZonedDateTime zonedDateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);
        return zonedDateTime.format(formatter);
    }

    /**
     * Method to convert zoned date time to string.
     *
     * @param zonedDateTime - date time in ZonedDateTime
     * @return - ZonedDateTime in string format
     */
    public static String getISODateStringFromZonedDateTime(ZonedDateTime zonedDateTime) {
        return zonedDateTime.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
    }

    /**
     * Method to convert string date time to ZonedDateTime.
     *
     * @param stringDate - date time in string
     * @return - ZonedDateTime in ZonedDateTime format
     */
    public static ZonedDateTime getISODateZonedDateTimeFromString(String stringDate) {
        return ZonedDateTime.parse(stringDate, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
    }

    /**
     * Method to get current ZonedDateTime in ISO format.
     *
     * @return current ISO zonedDateTime in string format
     */
    public static String getCurrentISOFormattedDateInString() {
        return ZonedDateTime.now(ZoneId.of("UTC")).format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
    }
}
