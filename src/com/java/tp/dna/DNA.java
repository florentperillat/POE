package com.java.tp.dna;

import java.util.ArrayList;

public class DNA {
    private ArrayList<Nucleotide> brin = new ArrayList<>();

    public DNA () {

    }

    public void add (Nucleotide n) {
        this.getBrin().add(n);
    }

    public Nucleotide apparie (Nucleotide n) {
        if(n.getSymbol() =='A'){
            return new Nucleotide('T');
        } else {
            return new Nucleotide(n.getComplementaire().getSymbol());
        }
    }

    public static Nucleotide transcription(Nucleotide n){
        if(n.getSymbol() =='A'){
            return new Nucleotide('U');
        } else {
            return new Nucleotide(n.getComplementaire().getSymbol());
        }
    }
    public String brinOppose(){
        String result = "";
        for(Nucleotide n:getBrin()) {
            if(n.getSymbol()=='A') {
                result += 'U';
            } else {
                result += n.getComplementaire();
            }
        }
        return result;
    }

    public ArrayList<Nucleotide> getBrin() {
        return brin;
    }

    private void setBrin(ArrayList<Nucleotide> brin) {
        this.brin = brin;
    }
}
