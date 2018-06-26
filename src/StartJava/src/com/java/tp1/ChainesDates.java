package com.java.tp1;

import java.util.Scanner;

public class ChainesDates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//Trois façon de créer un tableau
//		String[] tableaux1 = {"salut", "le", "monde"};
//		String tableaux2[] = {"salut", "le", "monde"};
//		String[] tableaux3 = new String[3];
//		tableaux3[2] = "monde";
//		tableaux3[0] = "salut";
//		tableaux3[1] = "le";
		
		System.out.println("Entrez une chaîne de caractères");
		String chaine = sc.nextLine();
		System.out.println("Entrez une chaîne à rechercher");
		String search = sc.nextLine();
		int nbOccurence = 0;
		
		String words[] = chaine.split(" ");
		for (int i = 0; i < words.length; i++) {
			if (words[i]==search) {
				nbOccurence++;
			}
		}
		
		System.out.printf("La chaîne %s apparaît %d fois", search, nbOccurence);
		sc.close();
//		Date date = new Date();
//		String[] jours = {"lundi", "mardi", "mercredi", "jeudi", "vendredi", "samedi", "dimanche"};
//		String[] mois = {"janvier", "février", "mars", "avril", "mai", "juin", "juillet", "août", "septembre", "octobre", "novembre", "décembre"};		for(int i=0;i<31;i++) {
//			for(int k=0; k<12; k++) {
//				for (int j=0; j<7; j++) {
//					if(i>30) {
//						break;
//					}
//					System.out.println(jours[j]+" "+(i+1)+ " " + mois[k] + " 2018");
//					i++;
//				}
//				i--;
//			}
//		}
	}
}
