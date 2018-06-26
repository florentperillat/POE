	/* Static fonctionnement */
	// 1ère classe Personne dans le fichier Personne.java.
//package com.java.tp1;
//
//	public class Personne {
//	    public String nom;
//	    public String prenom;
//	    public int num = 0;
//	    public static int compteur;
//
//	    public Personne(String name, String firstname) {
//	        nom = name;
//	        prenom = firstname;
//	    }
//
//	    public Personne(String nom) {
//	        this.nom = nom;
//	    }
//
//	    public Personne() {
//	        compteur++;
//	    }
//
//	    public void affiche(){
//	        System.out.println(num);
//	    }
//	}
//
//	// 2ème classe Methode dans le fichier Methode.java
//	package com.formation;
//
//	import java.util.Date;
//
//	public class Methode {
//
//	    public static void main(String[] args) {
//	        Personne p1 = new Personne();
//	        p1.nom = "toto";
//	        System.out.println(p1.num); // 0
//	        p1.num++; // 1
//	        System.out.println(p1.num); // 1
//
//	        System.out.println("p1 compteur : "+Personne.compteur);// 1
//
//	        Personne p2 = new Personne();
//	        p2.nom = "tata";
//	        System.out.println(p2.num); // 0
//	        p1.num++; // 2
//	        System.out.println(p2.num); // 0
//
//	        System.out.println("p1 compteur : " + Personne.compteur); // 2
//
//	        System.out.println("p2 compteur : "+Personne.compteur); // 2
//
//	    }
//	}
//	
//	/* Fin Static fonctionnement */