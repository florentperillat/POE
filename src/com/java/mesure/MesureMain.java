package com.java.mesure;

import java.io.IOException;

public class MesureMain {
    public static void main (String[] args){
        MesureRepository mp = new MesureRepository();
        try {
            mp.load("curve.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(mp.getTheoricalList());
        System.out.println(mp.getMesureList());
        System.out.println(mp.getDifferenceList());
    }
}
