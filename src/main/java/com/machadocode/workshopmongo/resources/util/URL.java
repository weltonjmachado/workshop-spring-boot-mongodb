package com.machadocode.workshopmongo.resources.util;

import java.io.UnsupportedEncodingException;
import java.util.Date;

public class URL {
    public static String decodeParam(String text) {
        try {
            return java.net.URLDecoder.decode(text, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            return "";
        }
    }
    public static Date convertDate(String textDate, Date defaultValue) {
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
        sdf.setTimeZone(java.util.TimeZone.getTimeZone("GMT"));
        try {
            return sdf.parse(textDate);
        } catch (java.text.ParseException e) {
            return defaultValue;
        }
    }
}
