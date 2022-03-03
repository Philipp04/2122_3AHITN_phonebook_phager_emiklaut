package com.company;

public class IllegalDateException {
    private int type;
    public final static int DAY_ILLEGAL = 1;
    public final static int MON_ILLEGAL = DAY_ILLEGAL + 1;


    public IllegalDateException(int type) {
        this.type = type;
        if (type == 1){
            System.out.println("Illegaler Tag!");
        }else {
            System.out.println("Illegales Monat!");
        }
    }

    public int getType() {
        return type;
    }

}




