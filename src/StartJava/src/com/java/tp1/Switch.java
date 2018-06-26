package com.java.tp1;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean on = true;
		do {
			System.out.println("Entrez une instruction\n1) Ouvrir\n2) Quitter\n3) Sauver");
			String instruction = sc.nextLine(); //en String permet d'éviter les erreurs si on ne rentre pas un entier (comme une lettre)
			switch (instruction.charAt(0)) { //permet de comprendre en n'interprêtant qu'un caractère
			case '1' : //si le premier caractère est '1'
				System.out.println("Ouverture d'un fichier\n1+1=2\n");
			break; //sans le break, tout est fait après ce point
			case '2' : //si le premier caractère est '2'
				System.out.println("Fermeture de l'application\nAu revoir!");
				on = false; //sortie de la boucle => fin du programme
			break; //sans le break, tout est fait après ce point
			case '3' : //si le premier caractère est '3'
				System.out.println("Sauvegarde des données\n");
				break; //sans le break, tout est fait après ce point
			default : //si l'instruction n'est pas listée
				System.out.println("Instruction non-reconnue\nEntrez 1 pour ouvrir, 2 pour quitter ou 3 pour sauver\n");
			} 
		} while (on);
		sc.close();
	}

}
