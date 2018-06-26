package com.java.tp1;

import java.util.Scanner;

public class exerciceMercredi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrez un code pays : ");
		String codePays = sc.nextLine();
		codePays=codePays.toUpperCase(); //permet de passer en majuscule une chaîne de caractèresft
		System.out.printf("Le code pays est %s\n", codePays);
		switch (codePays) {
		case "FR" : 
			System.out.println("La langue du pays est le français");
			break;
		case "ES" : 
			System.out.println("La langue du pays est l'espagnol");
			break;
		case "DE" : 
			System.out.println("La langue du pays est l'allemand");
			break;
		case "UK" : 
			System.out.println("La langue du pays est l'anglais");
			break;
		case "MX" :
			System.out.println("La langue du pays est l'espagnol");
			break;
		default :
			System.out.println("Le code de ce pays n'est pas reconnu");
		}
/*		if (codePays.equals("UK")||codePays.equals("uk")) {
			System.out.println("La langue du pays est l'anglais");
		}
		else if (codePays.equals("ES")||codePays.equals("es")||codePays.equals("MX")||codePays.equals("mx")) {
			System.out.println("La langue du pays est l'espagnol");
		}
		else if (codePays.equals("FR")||codePays.equals("fr")) {
			System.out.println("La langue du pays est le français");
		}
		else if (codePays.equals("DE")||codePays.equals("de")){
			System.out.println("La langue du pays est l'allemand");
		}
		else {
			System.out.println("Le code de ce pays n'est pas reconnu");
		}
*/		sc.close();
	}
}
	
