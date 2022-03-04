package com.company;

/**
 * IllegalDateException wirft eine Exception, falls
 * der Tag und/oder das Monat illegal ist.
 *
 * @author emiklaut
 * @version 1.0
 */



public class IllegalDateException extends Throwable {
    private int type;
    public final static int DAY_ILLEGAL = 1;
    public final static int MON_ILLEGAL = DAY_ILLEGAL + 1;


    IllegalDateException(int type) {
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




