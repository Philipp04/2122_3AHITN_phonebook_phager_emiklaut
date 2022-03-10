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

    Date(int d, int m, int y) throws IllegalDateException {
        mon = m;
        day = d;
        year = y;
        isValid();

    }

    Date(String date) throws IllegalDateException {
        String[] parts = date.split("\\.");
        day = Integer.parseInt(parts[0]);
        mon = Integer.parseInt(parts[1]);
        year = Integer.parseInt(parts[2]);
            isValid();
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

    public boolean isValid() throws IllegalDateException {
        if(day > 31 || day < 1){
            throw new IllegalDateException(IllegalDateException.DAY_ILLEGAL);
        }else if(mon > 31 || mon < 0){
            throw new IllegalDateException(IllegalDateException.MON_ILLEGAL);
        }

        return true;
    }



    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", mon=" + mon +
                ", year=" + year +
                '}';
    }
}
