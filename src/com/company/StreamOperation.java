package com.company;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
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
    public void ToStream(Writer w, Person p) {

    }

    public Person fromStream(Reader r) throws IOException {
        Scanner s = new Scanner(r);

            String data = s.nextLine();
            String[] d = data.split(";");
            try {
                Date date = new Date(d[3]);
                Date.isValid(date);
                PhoneNumber pn = new PhoneNumber(d[4]);
                PhoneNumber.isValidPhoneNumber(pn);
                return new Person(d[0], d[1], date, pn);

            } catch (IllegalDateException | IllegalPhoneNumberException e ){
                e.printStackTrace();
            }
            return null;

        }
    }

