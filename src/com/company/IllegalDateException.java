package com.company;

public class IllegalDateException {
    private int type;
    public final static int DAY_ILLEGAL = 122;
    public final static int MON_ILLEGAL = DAY_ILLEGAL + 1;


    public void IllegalDateException(int type) {
        this.type = type;
    }
}




