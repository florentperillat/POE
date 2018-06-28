package com.java.tp.dna;

import java.util.ArrayList;

public class RNA {
    private ArrayList<Nucleotide> brin = new ArrayList<>();


    public RNA (String brin) {
        for(char c:brin.toCharArray()){
            this.brin.add(new Nucleotide(c));
        }
    }

    public String brinToString(){
        String result = "";
        for(Nucleotide n:getBrin()) {
            if(n.getSymbol()=='A') {
                result += 'U';
            } else if(n.getSymbol()=='C') {
                result += 'G';
            } else if(n.getSymbol()=='G') {
                result += 'C';
            } else {
                result += n.getComplementaire().getSymbol();
            }
        }
        return result;
    }

    public String traduction() {
        String res ="";
        for(int i = 0; i<brin.size()-1; i=i+3){
            res += new Codon(brin.get(i).getSymbol(),brin.get(i+1).getSymbol(),brin.get(i+2).getSymbol()).getProtein();
        }
        return res;
    }

    public ArrayList<Nucleotide> getBrin() {
        return brin;
    }
}
