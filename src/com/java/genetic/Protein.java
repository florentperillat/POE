package com.java.genetic;

import java.util.ArrayList;
import java.util.List;

public class Protein {

    private List<Codon> chain = new ArrayList<>();

    public List<Codon> getChain() {
        return chain;
    }

    public Protein() {}

    public Protein(List<Codon> chain) {
        this.chain = chain;
    }

    public boolean isProtein() {
        return chain.size() > 50;
    }

    @Override
    public String toString() {
        String s = "Peptide : \"";
        if(isProtein()) {
            s = "Protein : \"";
        }
        for(Codon c : chain) {
            s+=c.getSymbol();
        }
        return s+"\"";
    }
}