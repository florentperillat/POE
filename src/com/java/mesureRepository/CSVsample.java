package com.java.mesureRepository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class CSVsample {

    public static void main (String[] args) {
        String uri ="excel.csv";
        System.getProperty("user.dir");
        System.out.println("Lecture du fichier "+uri);
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(uri));
            String line=br.readLine();
            while(line!=null) {
                // traitement
                System.out.println(line);
                line=br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String s = "A;B;C";
        StringTokenizer st = new StringTokenizer(s, ";");
        System.out.println(st.nextToken()); //A
        System.out.println(st.nextToken()); //B
        System.out.println(st.nextToken()); //C
        s = "3.14";
        double d = Double.parseDouble(s);
        System.out.println(d+1.3);


        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
