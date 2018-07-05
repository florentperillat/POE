package com.java.genetic;

public class Nucleotide {

    private String symbol;
    private String name;
    private String familly;

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public Nucleotide(String symbol) {
        this.symbol = symbol;
        if(symbol.equals("A")) {
            name = "Adenine";
            familly = "Purine";
        }
        else if(symbol.equals("T")) {
            name = "Thymine";
            familly = "Pyrimidine";
        }
        else if(symbol.equals("C")) {
            name = "Cytosine";
            familly = "Pyrimidine";
        }
        else if(symbol.equals("G")) {
            name = "Guanine";
            familly = "Purine";
        }
        else if(symbol.equals("U")) {
            name = "Uracine";
            familly = "Pyrimidine";
        }
        else {
            System.err.println("Nucleotide error "+symbol);
        }

    }

    public Nucleotide getApparie(boolean isArn) {
        if(symbol.equals("A")) {
            if(isArn) {
                return new Nucleotide("U");
            }
            else {
                return new Nucleotide("T");
            }
        }
        else if(symbol.equals("T")) {
            return new Nucleotide("A");
        }
        else if(symbol.equals("C")) {
            return new Nucleotide("G");
        }
        else if(symbol.equals("G")) {
            return new Nucleotide("C");
        }
        else if(symbol.equals("U")) {
            return new Nucleotide("A");
        }
        else {
            return null;
        }
    }

    public String toString() {
        return symbol;
    }
}