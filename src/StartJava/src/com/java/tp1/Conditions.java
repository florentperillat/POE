package com.java.tp1;

import java.util.Scanner;

class Conditions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Rentrez un entier x : ");
		int x = sc.nextInt();
		System.out.println("Rentrez un entier y : ");
		int y = sc.nextInt();
		
		if ((x>0 ^ y<0)) { // ^ = XOR = OU EXCLUSIF aussi faisable avec x>0&&y>0||x<0&&y<0
			System.out.println("Le produit est positif");
		} else if ((x<0 ^ y<0)) { // ^ = XOR = OU EXCLUSIF aussi faisable avec x>0&&y<0||x<0&&y>0
			System.out.println("Le produit est négatif");
		} else {
			System.out.println("Le produit est nul");
		}
		

		System.out.println("Rentrez un entier n : ");
		int n = sc.nextInt();
		int sum =0;
		for(int i=0; i<=n; i++) {
			sum+=i*i;
		}
		System.out.println(sum);
		sc.close();
	}

}
