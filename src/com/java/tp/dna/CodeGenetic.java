package com.java.tp.dna;

public class CodeGenetic {

    public static void main (String[] args) {
        Nucleotide n1 = new Nucleotide('U');
        Nucleotide n2 = new Nucleotide('A');
        Nucleotide n3 = new Nucleotide('G');
        Nucleotide n4 = new Nucleotide('C');
        RNA rna = new RNA();
        rna.add(n1);
        rna.add(n2);
        rna.add(n3);
        rna.add(n4);
        System.out.println(rna.brinToString());
    }
}
