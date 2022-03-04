package com.company;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IllegalDateException, IOException {
        File f = new File("C:\\Users\\Philipp\\IdeaProjects\\2122_3AHITN_phonebook_phager_emiklaut\\src\\com\\company\\data.csv");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        ArrayList<Person> al = new ArrayList<>();
        br.readLine();

        StreamOperation s = new StreamOperation();

        while(br.ready()){
            Person p = s.fromStream(br);
            br.readLine();
            al.add(p);
        }

        System.out.println(al.get(0).toString());

        /*try {
            Date.isValid(d);
        }catch (IllegalDateException e){
            e.printStackTrace();
        }
        */


    }
}
