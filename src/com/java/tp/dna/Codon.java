package com.java.tp.dna;

public class Codon {
    private Nucleotide[] codon = new Nucleotide[3];
    private String protein;

    public Codon(char first, char second, char third) {
        this.getCodon()[0] = new Nucleotide(first);
        this.getCodon()[1] = new Nucleotide(second);
        this.getCodon()[2] = new Nucleotide(third);

        switch (getCodon()[1].getSymbol()) {
            case 'C':
                switch (getCodon()[0].getSymbol()) {
                    case 'U':
                        protein = "Ser";
                        break;
                    case 'C':
                        protein = "Pro";
                        break;
                    case 'A':
                        protein = "Thr";
                        break;
                    case 'G':
                        protein = "Ala";
                        break;
                }
                break;
            case 'U':
                switch (getCodon()[0].getSymbol()) {
                    case 'C':
                        protein = "Leu";
                        break;
                    case 'G':
                        protein = "Val";
                        break;
                    case 'U':
                        switch (getCodon()[2].getSymbol()) {
                            case 'U':
                                protein = "Phe";
                                break;
                            case 'C':
                                protein = "Phe";
                                break;
                            case 'A':
                                protein = "Leu";
                                break;
                            case 'G':
                                protein = "Leu";
                                break;
                        }
                        break;
                    case 'A':
                        switch (getCodon()[2].getSymbol()) {
                            case 'G':
                                protein = "Met";
                                break;
                            case 'U':
                                protein = "Ile";
                                break;
                            case 'C':
                                protein = "Ile";
                                break;
                            case 'A':
                                protein = "Ile";
                                break;
                        }
                        break;
                }
                break;
            case 'G':
                switch (getCodon()[0].getSymbol()) {
                    case 'G':
                        protein = "Gly";
                        break;
                    case 'C':
                        protein = "Arg";
                        break;
                    case 'A':
                        switch (getCodon()[2].getSymbol()) {
                            case 'U':
                                protein = "Ser";
                                break;
                            case 'C':
                                protein = "Ser";
                                break;
                            case 'A':
                                protein = "Arg";
                                break;
                            case 'G':
                                protein = "Arg";
                                break;
                        }
                        break;
                    case 'U':
                        switch (getCodon()[2].getSymbol()) {
                            case 'U':
                                protein = "Cys";
                                break;
                            case 'C':
                                protein = "Cys";
                                break;
                            case 'A':
                                protein = "Stop";
                                break;
                            case 'G':
                                protein = "Trp";
                                break;
                        }
                        break;

                }
                break;
            case 'A':
                switch (getCodon()[0].getSymbol()) {
                    case 'G':
                        switch (getCodon()[2].getSymbol()) {
                            case 'U':
                                protein = "Asp";
                                break;
                            case 'C':
                                protein = "Asp";
                                break;
                            case 'A':
                                protein = "Glu";
                                break;
                            case 'G':
                                protein = "Glu";
                                break;
                        }
                        break;
                    case 'C':
                        switch (getCodon()[2].getSymbol()) {
                            case 'U':
                                protein = "His";
                                break;
                            case 'C':
                                protein = "His";
                                break;
                            case 'A':
                                protein = "Gln";
                                break;
                            case 'G':
                                protein = "Gln";
                                break;
                        }
                        break;
                    case 'A':
                        switch (getCodon()[2].getSymbol()) {
                            case 'U':
                                protein = "Asn";
                                break;
                            case 'C':
                                protein = "Asn";
                                break;
                            case 'A':
                                protein = "Lys";
                                break;
                            case 'G':
                                protein = "Lys";
                                break;
                        }
                        break;
                    case 'U':
                        switch (getCodon()[2].getSymbol()) {
                            case 'U':
                                protein = "Tyr";
                                break;
                            case 'C':
                                protein = "Tyr";
                                break;
                            case 'A':
                                protein = "Stop";
                                break;
                            case 'G':
                                protein = "Stop";
                                break;
                        }
                        break;
                }
        }
    }

    public Nucleotide[] getCodon() {
        return codon;
    }

    public String getProtein() {
        return protein;
    }
}

