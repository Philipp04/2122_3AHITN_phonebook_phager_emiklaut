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

    public String getName() {
        return name;
    }

    public String getGivenname() {
        return givenname;
    }

    public String getNickname() {
        return nickname;
    }

    public PhoneNumber getPhone() {
        return phone;
    }

    public Date getBirthday(){
        return birthday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", givenname='" + givenname + '\'' +
                ", nickname='" + nickname + '\'' +
                ", birthday=" + birthday.getDay() + "/" + birthday.getMon() + "/" + birthday.getYear() +
                ", phone=" + phone +
                '}';
    }
}
