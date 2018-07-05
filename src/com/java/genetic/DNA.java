package com.java.genetic;

import java.util.ArrayList;

public class DNA extends Brin {

    public DNA() {
    }

    public DNA(String code) {
        for(char c : code.toCharArray()) {
            Nucleotide b = new Nucleotide(String.valueOf(c));
            if(c == 'U') {
                System.out.println("U is forbidden in DNA");
            }
            getStrand().add(b);
        }
    }


    public ArrayList<Nucleotide> getComplementary() {
        ArrayList<Nucleotide> res = new ArrayList<>();
        for(Nucleotide b : getStrand()) {
            res.add(b.getApparie(false));
        }
        return res;
    }

    public RNA transcription() {
        RNA arn = new RNA();
        for(Nucleotide b : getStrand()) {
            arn.getStrand().add(b.getApparie(true));
        }
        return arn;
    }
}