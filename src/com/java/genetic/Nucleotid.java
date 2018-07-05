package com.java.genetic;

import java.util.ArrayList;

public abstract class Nucleotid {

    private ArrayList<Base> strand = new ArrayList<>();

    public String toString() {
        String res = "";
        for(Base b : getStrand()) {
            res += b.getSymbol();
        }
        return res;
    }

    public ArrayList<Base> getStrand() {
        return strand;
    }
}
