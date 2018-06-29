package com.java.train;

public class Employe extends Personne {
    double salaire;

    public Employe(){

    }
    public Employe(String nom, String prenom, int age, double salaire){
        super(nom, prenom, age);
        this.salaire  = salaire;
    }
}
