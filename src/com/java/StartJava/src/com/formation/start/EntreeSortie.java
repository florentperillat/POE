package com.formation.start;
import java.util.Scanner;

public class EntreeSortie {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String prenom =sc.nextLine();
		System.out.println("Bonjour " + prenom);
		System.out.println("Entrez une chaine : ");
		String c = sc.nextLine();
		System.out.println("vous avez rentr� : " + c);
		System.out.println("Entrez un entier : ");
		int i = sc.nextInt();
		System.out.println("vous avez rentr� : " + i);
		System.out.println("Entrez un double : ");
		double d = sc.nextDouble();
		System.out.println("vous avez rentr� : " + d);
		System.out.println("Entrez un long : ");
		long l = sc.nextLong();
		System.out.println("vous avez rentr� : " + l);
		System.out.println("retour \n� \nla \nligne\n");
		sc.close();
	}

}
