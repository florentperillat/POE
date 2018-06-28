package com.java.tp.dna;

import java.util.ArrayList;

public class DNA {
    private ArrayList<Nucleotide> brin = new ArrayList<>();

    public DNA () {
    }

    public DNA (String brin) {
        for(char c:brin.toCharArray()){
            this.brin.add(new Nucleotide(c));
        }
    }

    public void add (Nucleotide n) {
        this.getBrin().add(n);
    }

    public String brinToString(){
        String result = "";
        for(Nucleotide n:getBrin()) {
            result += n.getSymbol();
        }
        return result;
    }


    public void brinDisplay(){
        for(Nucleotide n:getBrin()) {
            n.display();
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
                result += 'T';
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

    public String rnaString(){
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

    public ArrayList<Nucleotide> getBrin() {
        return brin;
    }
}
