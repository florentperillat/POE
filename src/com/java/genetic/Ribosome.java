package com.java.genetic;
import java.util.*;

public class Ribosome {

    private Map<String, String> codonMap = new HashMap<>();

    public Ribosome() {
        codonMap.put("UUU","F");
        codonMap.put("UUC","F");
        codonMap.put("UUA","L");
        codonMap.put("UUG","L");
        codonMap.put("CUU","L");
        codonMap.put("CUC","L");
        codonMap.put("CUA","L");
        codonMap.put("CUG","L");
        codonMap.put("AUU","I");
        codonMap.put("AUC","I");
        codonMap.put("AUA","I");
        codonMap.put("AUG","M");
        codonMap.put("GUU","V");
        codonMap.put("GUC","V");
        codonMap.put("GUA","V");
        codonMap.put("GUG","V");
        codonMap.put("UCU","S");
        codonMap.put("UCC","S");
        codonMap.put("UCA","S");
        codonMap.put("UCG","S");
        codonMap.put("CCU","P");
        codonMap.put("CCC","P");
        codonMap.put("CCA","P");
        codonMap.put("CCG","P");
        codonMap.put("ACU","T");
        codonMap.put("ACC","T");
        codonMap.put("ACA","T");
        codonMap.put("ACG","T");
        codonMap.put("GCU","A");
        codonMap.put("GCC","A");
        codonMap.put("GCA","A");
        codonMap.put("GCG","A");
        codonMap.put("UAU","Y");
        codonMap.put("UAC","Y");
        codonMap.put("UAA"," ");
        codonMap.put("UAG"," ");
        codonMap.put("CAU","H");
        codonMap.put("CAC","H");
        codonMap.put("CAA","Q");
        codonMap.put("CAG","Q");
        codonMap.put("AAU","N");
        codonMap.put("AAC","N");
        codonMap.put("AAA","K");
        codonMap.put("AAG","K");
        codonMap.put("GAU","D");
        codonMap.put("GAC","D");
        codonMap.put("GAA","E");
        codonMap.put("GAG","E");
        codonMap.put("UGU","C");
        codonMap.put("UGC","C");
        codonMap.put("UGA"," ");
        codonMap.put("UGG","W");
        codonMap.put("CGU","R");
        codonMap.put("CGC","R");
        codonMap.put("CGA","R");
        codonMap.put("CGG","R");
        codonMap.put("AGU","S");
        codonMap.put("AGC","S");
        codonMap.put("AGA","R");
        codonMap.put("AGG","R");
        codonMap.put("GGU","G");
        codonMap.put("GGC","G");
        codonMap.put("GGA","G");
        codonMap.put("GGG","G");
    }

    public List<Protein> translate(RNA rna) throws DNAException {
        List<Codon> chain = new ArrayList<>();
        for(int i = 0;i<rna.getStrand().size();i+=3) {
            Nucleotide nucleotide1 = rna.getStrand().get(i);
            Nucleotide nucleotide2 = null;
            Nucleotide nucleotide3 = null;
            if(i+1 < rna.getStrand().size()) {
                nucleotide2 = rna.getStrand().get(i+1);
            }
            if(i+2 < rna.getStrand().size()) {
                nucleotide3 = rna.getStrand().get(i+2);
            }
            if(nucleotide3 != null) {
                Codon aa = translate(nucleotide1, nucleotide2, nucleotide3);
                chain.add(aa);
            }
        }
        return cut(chain);
    }

    private List<Protein> cut(List<Codon> chain) {
        List<Protein> res = new ArrayList<>();
        Protein p = new Protein();
        for(Codon aa : chain) {
            if(aa.getName().equals("STOP")) {
                if(p.getChain().size() > 1) {
                    res.add(p);
                    p = new Protein();
                }
            }
            else {
                p.getChain().add(aa);
            }
        }
        if(p.getChain().size() > 1) {
            res.add(p);
        }
        return res;
    }

    private Codon translate(Nucleotide nucleotide1, Nucleotide nucleotide2, Nucleotide nucleotide3) throws DNAException {
        String codon = nucleotide1.getSymbol()+ nucleotide2.getSymbol()+ nucleotide3.getSymbol();
        Codon aa = new Codon(codonMap.get(codon));
        return aa;
    }
}