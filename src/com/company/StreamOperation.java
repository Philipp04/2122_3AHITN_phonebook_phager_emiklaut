package com.company;

import java.io.*;
import java.util.Scanner;

/**
 * Streamoperation ist verantwortlich ein File zu schreiben und
 * ein File zu lesen.
 *
 * @author phager
 *
 * @version  1.0
 */



public class StreamOperation {
    public void ToStream(Writer w, Person p) throws IOException {
        BufferedWriter fw = new BufferedWriter(w);
        fw.newLine();
        fw.write(p.toString());
         fw.close();
                //Captain;America;Cap;04.07.1918;001 1234/234451
    }

    public Person fromStream(Reader r) throws IOException {
        BufferedReader dr = (BufferedReader) r;
            String data = dr.readLine();
            String[] d = data.split(";");
            try {
                Date date = new Date(d[3]);
                date.isValid();
                PhoneNumber pn = new PhoneNumber(d[4]);
                PhoneNumber.isValidPhoneNumber(pn);
                return new Person(d[0], d[1], date, pn);

            } catch (IllegalDateException | IllegalPhoneNumberException e ){
                e.printStackTrace();
            }
            return null;

        }
    }

