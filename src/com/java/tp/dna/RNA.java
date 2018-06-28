package com.java.tp.dna;

import java.util.ArrayList;

public class RNA {
    private ArrayList<Nucleotide> brin = new ArrayList<>();

    public RNA () {

    }

    public void add (Nucleotide n) {
        this.getBrin().add(n);
    }

    public String brinToString(){
        //TODO
        String result = "";
        for(Nucleotide n:getBrin()) {
            result += n.getSymbol();
        }
        return result;
    }

    public String brinOppose(){
        String result = "";
        for(Nucleotide n:getBrin()) {
            if(n.getSymbol()=='A') {
                result += 'U';
            } else {
                result += n.getApparie();
            }
        }
        return result;
    }
    public void transcription(DNA dna) {
      //  for(i:dna.brin){

       //s }
    }

    public ArrayList<Nucleotide> getBrin() {
        return brin;
    }

    public void setBrin(ArrayList<Nucleotide> brin) {
        this.brin = brin;
    }
}
