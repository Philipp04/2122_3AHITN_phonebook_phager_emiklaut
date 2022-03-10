package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *Verbindung der Eingabe Klassen mit den Daten Klassen
 *
 * @author P. Hager
 * @version 1.0
 */

public class Main {

    public static void main(String[] args) throws IllegalDateException, IOException {
        File f = new File("data.csv");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        ArrayList<Date> al = new ArrayList<>();
        StreamOperation s = new StreamOperation();
        br.readLine();
        Writer w = new FileWriter(f,true);
        Person newPerson = new Person("Manuel","Neuer",new Date(2,3,2002),new PhoneNumber("001 1234/234451"));

        s.ToStream(w,newPerson);

        while(br.ready()){
            Person p = s.fromStream(br);
            al.add(p.getBirthday());
        }

        Iterator<Date> l = al.iterator();
        while(l.hasNext()){
            Date gb = (Date) l.next();
            System.out.println(gb.toString());
        }





    }
}
