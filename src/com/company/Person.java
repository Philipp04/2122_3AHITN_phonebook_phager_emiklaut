package com.company;

/**
 *Die Person-Klasse speichert die Eigenschaften einer Person und wandelt alle Eigenschaften in einem String um.
 *
 * @author P. Hager
 * @version 1.0
 */
public class Person {
    private String name;
    private String givenname;
    private String nickname;
    private Date birthday;
    private PhoneNumber phone;

    Person (String n, String gn, Date bd, PhoneNumber p){
        name = n;
        givenname = gn;
        birthday = bd;
        phone = p;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", givenname='" + givenname + '\'' +
                ", nickname='" + nickname + '\'' +
                ", birthday=" + birthday +
                ", phone=" + phone +
                '}';
    }
}
