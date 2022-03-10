package com.company;

/**
 * PhoneNumber gibt an welchen areacode die Telefonnummer hat.
 * Aus welchem Land die Telefonnummer kommt und die eigentliche
 * Telefonnummer.
 *
 * @author  phager
 *
 * @version 1.0
 */


public class PhoneNumber {
    private int country;
    private int areacode;
    private int number;

    PhoneNumber(int c, int a, int n){
        country = c;
        areacode = a;
        number = n;
    }

    PhoneNumber(String number) throws IllegalPhoneNumberException {
        try {
            String[] parts = number.split(" ");
            country = Integer.parseInt(parts[0]);
            String[] area = parts[1].split("/");
            this.areacode = Integer.parseInt(area[0]);
            this.number = Integer.parseInt(area[1]);
        }catch (Exception e){
            throw new IllegalPhoneNumberException(IllegalPhoneNumberException.STRING_FORMAT_ILLEGAL);
        }
    }

    public int getAreaCode(){
        return areacode;
    }

    public int getNumber(){
        return number;
    }

    public int getCountryCode(){
        return country;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "country=" + country +
                ", areacode=" + areacode +
                ", number=" + number +
                '}';
    }

    public static boolean isValidPhoneNumber(PhoneNumber d) throws IllegalPhoneNumberException {
        if(d.country < 0 || d.country >= 100){
            throw new IllegalPhoneNumberException(1);
        }else if(d.areacode > 10000 || d.areacode < 0){
            throw new IllegalPhoneNumberException(2);
        }else if(d.number > 100000000 || d.number < 0){
            throw new IllegalPhoneNumberException(3);
        }
        return false;
    }
}
