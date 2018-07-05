package com.java.genetic;
import java.io.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {
/*            //DNARepository.generateRandomDNAFile("dna.txt", 10000);
            Nucleotide a = new Nucleotide("A");
            System.out.println(a);
            System.out.println(a.getApparie(false));
            DNA dna = new DNA("ATCG");
            System.out.println(dna);
            System.out.println(dna.getComplementary());
            RNA rna = dna.transcription();
            System.out.println(rna);
            dna = new DNA("GAAAGAGCG");
            rna = dna.transcription(); // CUUUCUCGC
            System.out.println(rna);
            Ribosome r1 = new Ribosome();
            Protein protein = r1.translate(rna).get(0); // LSR
            System.out.println(protein);
*/

            DNARepository repo = new DNARepository();
            repo.load("dna.txt");
            DNA dna = repo.getDNA();
            System.out.println(dna);
            RNA rna = dna.transcription();
            System.out.println(rna);
            Ribosome r1 = new Ribosome();
            List<Protein> proteinList = r1.translate(rna);
            System.out.println(proteinList);
            for (Protein p : proteinList) {
                if (!p.isProtein()) {
                    System.out.print("Peptide : ");
                } else {
                    System.out.print("Protein : ");
                }
                for (int i = 0; i<p.getChain().size()-1; i++) {
                    System.out.print(p.getChain().get(i).getTrigram() + "|");
                }
                System.out.println(p.getChain().get(p.getChain().size()-1).getTrigram());
            }
        }
        catch (DNAException ex) {
            System.out.println(ex);
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
//

    }
}