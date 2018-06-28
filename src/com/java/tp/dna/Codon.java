package com.java.tp.dna;

public class Codon {
    Nucleotide first;
    Nucleotide second;
    Nucleotide third;

    public Codon(char first, char second, char third) {
        this.first = new Nucleotide(first);
        this.first = new Nucleotide(second);
        this.first = new Nucleotide(third);
    }
}
