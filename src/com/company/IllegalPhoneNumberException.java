package com.company;

/**
 * IllegalPhoneNumberException  throwt eine Exception, falls
 * eine PhoneNumber illegal ist.
 *
 * @author emiklaut
 *
 * @version  1.0
 */

public class IllegalPhoneNumberException extends Throwable {
    public int type;
    public final static int COUNTRY_ILLEGAL = 1;
    public final static int AREA_ILLEGAL = COUNTRY_ILLEGAL + 1;
    public final static int NUMBER_ILLEGAL = AREA_ILLEGAL + 1;
    public final static int STRING_FORMAT_ILLEGAL = NUMBER_ILLEGAL + 1;


     IllegalPhoneNumberException(int type) {
        this.type = type;

       if (type == COUNTRY_ILLEGAL){
            System.out.println("Illegales Land");
        }else if (type == AREA_ILLEGAL){
           System.out.println("Illegaler Ort");
       }else if(type == NUMBER_ILLEGAL){
           System.out.println("Illegale Nummer");
       }else {
           System.out.println("Illegales String Format");
       }

    }
}
