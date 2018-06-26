package com.java.tp1;

import java.util.Scanner;

public class BoucleFor {
// Ctrl+Maj+: pour mettre un ensemble de lignes en commentaire
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int /*nbColonnes,*/ nbLignes;
//		do {
//			System.out.println("Entrez un nombre de colonnes");
//			nbColonnes = sc.nextInt();
//		} while (nbColonnes<0);		
		do {
			System.out.println("Entrez un nombre de lignes");
			nbLignes = sc.nextInt();
		} while (nbLignes<0);
											// triangle inversé
		for (int x = 0; x<nbLignes; x++) { //pour chaque ligne
			for (int y = 0; y<x+1; y++) { // crée une nouvelle boucle qui créera des * tant que les colonnes 
				System.out.print("*");	// sont inférieures aux lignes+1
			}
			System.out.println(" ");
		}
			

		//losange tentative
//		for(int i=nbLignes; i>0; i--) {
//			for(int j=0; j<nbColonnes; j++) {
//				if(i<=j) {
//					System.out.print("*");
//					
//				}				
//				if(i>j) {
//					System.out.print(" ");
//				}
//			}
//			for(int j=nbColonnes; j>0; j--) {
//				if(i<=j) {
//					System.out.print("*");
//				}				
//				if(i>j) {
//					System.out.print(" ");
//				}
//			}
//			switch (i) {
//			case 0 : 
//				System.out.println("*");
//				break;
//			default :
//				System.out.println();
//				break;
//			}
//		}
//		for(int i=0; i<nbLignes+3; i++) {
//			for(int j=0; j<nbColonnes+1; j++) {
//				if(i<=j) {
//					System.out.print("*");
//				}				
//				if(i>j) {
//					System.out.print(" ");
//				}
//			}
//			for(int j=nbColonnes-1; j>0; j--) {
//				if(i<=j) {
//					System.out.print("*");
//				}				
//				if(i>j) {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
		sc.close();
	}

}
