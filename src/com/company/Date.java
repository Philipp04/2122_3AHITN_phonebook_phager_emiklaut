package com.company;

public class Date {
    private int day;
    private int mon;
    private int year;

    Date(int m, int d, int y){
        mon = m;
        day = d;
        year = y;
    }

    Date(String date){
        String[] parts = date.split(".");
        day = Integer.parseInt(parts[0]);
        mon = Integer.parseInt(parts[1]);
        year = Integer.parseInt(parts[2]);
    }

    public int getDay(){
        return day;
    }

    public int getMon(){
        return mon;
    }

    public int getYear(){
        return year;
    }

    public boolean isLeapYear(){
        boolean r = false;
        if(year /4 == 0) {
            r = true;
            if (year / 100 == 0 && year / 400 != 0) {
                r = false;
            }
        }
        return r;

    }

    public boolean isValid(Date d){


        return false;
    }
}
