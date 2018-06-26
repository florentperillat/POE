package com.java.tp1;

import java.util.Scanner;

public class Impairs {

		//EXERCICE 1
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int nbMax = 0;
//		do {
//			System.out.println("Entrez un nombre positif");
//			nbMax = sc.nextInt();
//		} while (nbMax<0);
//		System.out.printf("Nombres impairs jusqu'à %d%n", nbMax);
//		for (int i=1; i<=nbMax; i++) {
//			if(i%2==1) {
//				System.out.println(i);
//			}
//		}

	
	//TENTATIVE EXERCICE 2
//		float sommeInitiale, sommeFinale, taux;
//		do {
//			System.out.println("Entrez une somme initiale");
//			sommeInitiale = sc.nextFloat();
//		} while (sommeInitiale<0);
//		
//		do {
//			System.out.println("Entrez une somme à atteindre");
//			sommeFinale = sc.nextFloat();
//		} while (sommeFinale<0);
//		
//		do {
//			System.out.println("Entrez un taux d'intérêt en pourcentage");
//			taux = sc.nextFloat();
//		} while (taux<=0||taux==1);
//		
//		float sommeN1 = sommeInitiale;
//		int i = 0;
//		do {
//			sommeN1 = sommeN1*taux/100;
//			i++;
//		} while (sommeN1<sommeFinale);
//		System.out.printf("Il faut %d années au minimum pour atteindre la somme", i);
		
	
	//EXERCICE 2 CORRECTION
		System.out.println("Montant");
		float initial = sc.nextFloat();
		System.out.println("Montant souhaité");
		float finale = sc.nextFloat();
		System.out.println("taux d'intérêt");
		float taux = sc.nextFloat();
		if (taux > 0 && initial <= finale) {
			int years = 0;
			while (initial <= finale) {
				initial = initial + (initial * (taux/100));
				years++;
			}
			System.out.println("Nombre d'années = " + years);
		}
		else {
			System.out.println("impossible d'atteindre le taux");
		}
		sc.close();
	}
}

