package com.java.tp.dna;

public class CodeGenetic {

    public static void main (String[] args) {
        Nucleotide n1 = new Nucleotide('T');
        Nucleotide n2 = new Nucleotide('T');
        Nucleotide n3 = new Nucleotide('G');
        Nucleotide n4 = new Nucleotide('C');
        Nucleotide n5 = new Nucleotide('A');
        Nucleotide n6 = new Nucleotide('G');
        DNA dna = new DNA();
        dna.add(n1);
        dna.add(n2);
        dna.add(n3);
        dna.add(n4);
        dna.add(n5);
        dna.add(n6);
        dna.brinDisplay();
        DNA dna2 = new DNA("CGATGC");
        System.out.println("Brin dna : " + dna.brinToString());
        System.out.println("Brin opposé dna : " + dna.brinOppose());
        System.out.println("Brin dna2 : " + dna2.brinToString());
        System.out.println("Brin opposé dna2 : " + dna2.brinOppose());
        System.out.println("ARN dna2 : " + dna2.rnaString());
        DNA dna3 = new DNA(dna2.brinOppose());
        System.out.println("Brin dna3 : " + dna3.brinToString());
        System.out.println("Brin opposé dna3 : " + dna3.brinOppose());
        RNA rna = new RNA(dna.rnaString());
        System.out.println("Brin rna : " + rna.brinToString());
        System.out.println("Traduction rna : " + rna.traduction());


    }
}
