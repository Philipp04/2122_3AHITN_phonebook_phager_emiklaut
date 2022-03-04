package com.company;

/**
 * Date-Klasse speichert Tag, Monat und Jahr und prüft ob Datum richtig eingegeben ist und ob dieses Jahr ein Schaltjahr ist.
 *
 * @author phager
 * @version 1.0
 */
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
        String[] parts = date.split("\\.");
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

    public static boolean isValid(Date d) throws IllegalDateException {
        if(d.day > 31 || d.day < 1){
            throw new IllegalDateException(1);
        }else if(d.mon > 31 || d.mon < 0){
            throw new IllegalDateException(2);
        }

        return false;
    }
}
