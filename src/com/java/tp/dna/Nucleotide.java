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
                this.setName("Cytosine");
                this.setFamily("Pyrimidine");
                break;
            case 'T':
                this.setName("Thymine");
                this.setFamily("Purine");
                this.setComplementaire(new Nucleotide('A'));
                break;
            case 'G':
                this.setName("Guanine");
                this.setFamily("Pyrimidine");
                break;
            case 'U':
                this.setName("Uracil");
                this.setFamily("Pyrimidine");
                this.setComplementaire(new Nucleotide('A'));
                break;
            default :
                break;
        }
    }

    public void display(){
        System.out.println(this.getSymbol());
        System.out.println(this.getName());
        System.out.println(this.getFamily());
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

    private void setComplementaire(Nucleotide comp) {
        this.complementaire = comp;
    }
}
