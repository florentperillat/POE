package com.java.tp1;

import java.util.Scanner;

public class calcul {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Rentrez un entier x : ");
		int x = sc.nextInt();
		System.out.println("Rentrez un entier y : ");
		int y = sc.nextInt();
		System.out.println("Somme de x et de y = " + (x+y));
		System.out.println("Différence de x par y = " + (x-y));
		System.out.println("Produit de x et de y = " + x*y);
		System.out.println("Quotient de x par y = " + ((float)x/(float)y));
		System.out.println("Reste de x par y = " + (float)x%(float)y);
		System.out.printf("Somme de x et de y = %d, Différence de x par y = %d, Produit de x et de y = %d Quotient de x par y = %2f, %nReste de x par y = %d",x+y,x-y,x*y,(float)x/y,x%y);
		sc.close(); //ferme le scanner mais on ne peut plus le reouvrir derrière ! Fermer à la toute fin
	}

}
