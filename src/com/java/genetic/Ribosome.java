package com.java.genetic;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ribosome {
    private List<Protein> protList = new ArrayList<>();
    private String uri ="";

    public void load(String uri) throws IOException {
        this.uri = uri;
        BufferedReader reader = new BufferedReader(new FileReader(this.uri));
        String s = reader.readLine();
        DNA dna = new DNA(s);
        System.out.println(dna);
        RNA rna = dna.transcription();
        System.out.println(rna);
        List<AminoAcid> peptide = rna.translate();
        Protein protein = new Protein();
        protein.setPeptide(peptide);
        System.out.println(protein);
        List<Protein> genome = protein.factory(peptide);
        System.out.println(genome.size());
        System.out.println(genome);
    }
}
