package com.java.genetic;

import java.util.ArrayList;

public abstract class Brin {

    private ArrayList<Nucleotide> strand = new ArrayList<>();

    public String toString() {
        String res = "";
        for(Nucleotide b : getStrand()) {
            res += b.getSymbol();
        }
        return res;
    }

    public ArrayList<Nucleotide> getStrand() {
        return strand;
    }
}
