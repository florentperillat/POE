package com.java.tp.dna;

public class Nucleotide {
    private char symbol;
    private String name;
    private String family;
    private Nucleotide complementaire;

    public Nucleotide(char sym) {
        this.setSymbol(sym);
        switch (sym) {
            case 'A':
                this.setName("Adenine");
                this.setFamily("Purine");
                break;
            case 'C':
                this.setName("Guanine");
                this.setFamily("Pyrimidine");
                this.setComplementaire(new Nucleotide('G'));
                break;
            case 'T':
                this.setName("Cytosine");
                this.setFamily("Purine");
                this.setComplementaire(new Nucleotide('A'));
                break;
            case 'G':
                this.setName("Guanine");
                this.setFamily("Pyrimidine");
                this.setComplementaire(new Nucleotide('C'));
                break;
            case 'U':
                this.setName("Uracil");
                this.setFamily("Pyrimidine");
                this.setComplementaire(new Nucleotide('A'));
                break;
        }
    }

    public void display(){
        System.out.println(this.getSymbol());
        System.out.println(this.getName());
        System.out.println(this.getFamily());
        System.out.println(this.getComplementaire());
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public char getSymbol() {
        return symbol;
    }

    private void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public String getFamily() {
        return family;
    }

    private void setFamily(String family) {
        this.family = family;
    }

    public Nucleotide getComplementaire() {
        return complementaire;
    }

    private void setComplementaire(Nucleotide apparie) {
        this.complementaire = apparie;
    }
}
