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
        String[] parts = number.split(" ");
        country = Integer.parseInt(parts[0]);
        String[] area = parts[1].split("/");
        this.areacode = Integer.parseInt(area[0]);
        this.number = Integer.parseInt(area[1]);
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

    public static boolean isValidPhoneNumber(PhoneNumber d){

        return false;
    }
}
