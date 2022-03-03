package com.company;

public class PhoneNumber {
    private int country;
    private int areacode;
    private int number;

    PhoneNumber(int c, int a, int n){
        country = c;
        areacode = a;
        number = n;
    }

    PhoneNumber(String number){
        this.number = Integer.parseInt(number);
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

    public boolean IsValidPhoneNumber(PhoneNumber d){
        return false;
    }
}
