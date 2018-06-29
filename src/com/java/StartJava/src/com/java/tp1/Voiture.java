package com.java.tp1;

import java.util.Scanner;

public class Voiture {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean bool = false;
		do { 
			System.out.println("Choisissez une couleur : VERT, BLEU, ROUGE, GRIS, NOIR");
			String couleur = sc.nextLine();
			for (Couleur c:Couleur.values()) {
				if (couleur.toUpperCase().equals(c.toString())){
					System.out.println("J'ai cette couleur en stock");
					bool = true;
					break;
				}
			}
			if (!bool) {
				System.out.println("Je n'ai pas cette couleur");
			}
		} while (!bool);
		sc.close();
	}

}
