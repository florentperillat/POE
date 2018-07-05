package com.java.genetic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RNA extends Brin {

    private Map<String, String> codonMap = new HashMap<>();
    public RNA() {
        codonMap.put("UUU","F");
        codonMap.put("UUC","F");
        codonMap.put("UUA","L");
        codonMap.put("UUG","L");
        codonMap.put("CUU","L");
        codonMap.put("CUC","L");
        codonMap.put("CUA","L");
        codonMap.put("CUG","L");
        codonMap.put("AUU","I");
        codonMap.put("AUC","I");
        codonMap.put("AUA","I");
        codonMap.put("AUG","M");
        codonMap.put("GUU","V");
        codonMap.put("GUC","V");
        codonMap.put("GUA","V");
        codonMap.put("GUG","V");
        codonMap.put("UCU","S");
        codonMap.put("UCC","S");
        codonMap.put("UCA","S");
        codonMap.put("UCG","S");
        codonMap.put("CCU","P");
        codonMap.put("CCC","P");
        codonMap.put("CCA","P");
        codonMap.put("CCG","P");
        codonMap.put("ACU","T");
        codonMap.put("ACC","T");
        codonMap.put("ACA","T");
        codonMap.put("ACG","T");
        codonMap.put("GCU","A");
        codonMap.put("GCC","A");
        codonMap.put("GCA","A");
        codonMap.put("GCG","A");
        codonMap.put("UAU","Y");
        codonMap.put("UAC","Y");
        codonMap.put("UAA"," ");
        codonMap.put("UAG"," ");
        codonMap.put("CAU","H");
        codonMap.put("CAC","H");
        codonMap.put("CAA","Q");
        codonMap.put("CAG","Q");
        codonMap.put("AAU","N");
        codonMap.put("AAC","N");
        codonMap.put("AAA","K");
        codonMap.put("AAG","K");
        codonMap.put("GAU","D");
        codonMap.put("GAC","D");
        codonMap.put("GAA","E");
        codonMap.put("GAG","E");
        codonMap.put("UGU","C");
        codonMap.put("UGC","C");
        codonMap.put("UGA"," ");
        codonMap.put("UGG","W");
        codonMap.put("CGU","R");
        codonMap.put("CGC","R");
        codonMap.put("CGA","R");
        codonMap.put("CGG","R");
        codonMap.put("AGU","S");
        codonMap.put("AGC","S");
        codonMap.put("AGA","R");
        codonMap.put("AGG","R");
        codonMap.put("GGU","G");
        codonMap.put("GGC","G");
        codonMap.put("GGA","G");
        codonMap.put("GGG","G");
    }


    public ArrayList<Codon> translate() {
        ArrayList<Codon> protein = new ArrayList<>();
        for(int i = 0;i<getStrand().size();i+=3) {
            Nucleotide n1 = getStrand().get(i);
            Nucleotide n2 = null;
            Nucleotide n3 = null;
            if(i+1 < getStrand().size()) {
                n2 = getStrand().get(i+1);
            }
            if(i+2 < getStrand().size()) {
                n3 = getStrand().get(i+2);
            }
            if(n3 != null) {
                Codon c = translate(n1, n2, n3);
                protein.add(c);
            }
        }
        return protein;
    }

    public Codon translate(Nucleotide n1, Nucleotide n2, Nucleotide n3) {
        String codon = n1.getSymbol()+ n2.getSymbol()+ n3.getSymbol();
        Codon c = new Codon(codonMap.get(codon));
        return c;
    }
}