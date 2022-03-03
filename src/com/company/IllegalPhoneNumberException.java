package com.company;

public class IllegalPhoneNumberException {
    public int type;
    public final static int COUNTRY_ILLEGAL = 1232112;
    public final static int AREA_ILLEGAL = COUNTRY_ILLEGAL + 1;
    public final static int NUMBER_ILLEGAL = AREA_ILLEGAL + 1;
    public final static int STRING_FORMAT_ILLEGAL = NUMBER_ILLEGAL + 1;


    public IllegalPhoneNumberException(int type) {
        this.type = type;
    }
}
