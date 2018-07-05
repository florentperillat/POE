package com.java.genetic;

import java.util.ArrayList;

public class DNA extends Nucleotid {

    public DNA() {
    }

    public DNA(String code) {
        for(char c : code.toCharArray()) {
            Base b = new Base(String.valueOf(c));
            if(c == 'U') {
                System.out.println("U is forbidden in DNA");
            }
            getStrand().add(b);
        }
    }


    public ArrayList<Base> getComplementary() {
        ArrayList<Base> res = new ArrayList<>();
        for(Base b : getStrand()) {
            res.add(b.getApparie(false));
        }
        return res;
    }

    public RNA transcription() {
        RNA arn = new RNA();
        for(Base b : getStrand()) {
            arn.getStrand().add(b.getApparie(true));
        }
        return arn;
    }
}