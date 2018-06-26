package com.java.tp1;

public class TestEnum {

	public static void main(String[] args) {

		for (Civilite c : Civilite.values()) { //foreach
			System.out.println(c);
		}
		for (Couleur c : Couleur.values()) {
			System.out.println(c);
		}
		
		System.out.println("bLEu".toUpperCase().equals(Couleur.BLEU.toString()));
	}

}
