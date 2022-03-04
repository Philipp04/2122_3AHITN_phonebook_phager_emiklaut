package com.company;

/**
 * IllegalPhoneNumberException wirft eine Exception, wenn
 * die Landes-Vorwahl, Ort-Nummer, Telefonnummer, String-Format der Telefonnummer
 * illegal ist/sind.
 *
 * @author emiklaut
 *
 * @version 1.0
 */


public class IllegalPhoneNumberException {
    public int type;
    public final static int COUNTRY_ILLEGAL = 1;
    public final static int AREA_ILLEGAL = COUNTRY_ILLEGAL + 1;
    public final static int NUMBER_ILLEGAL = AREA_ILLEGAL + 1;
    public final static int STRING_FORMAT_ILLEGAL = NUMBER_ILLEGAL + 1;


     IllegalPhoneNumberException(int type) {
        this.type = type;

      /*  if (type == 1){
            System.out.println("Illegales Land");
        }else if ()

       */
    }
}
