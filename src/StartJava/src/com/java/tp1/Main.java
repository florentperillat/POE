package com.java.tp1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		float b = 4.1f; //ajouter un f pour forcer le type en float si ça ne marche pas
		String s = "hello";
		String conc = " world";
		//final 
		int countdown = 1;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("s = " + s);

		System.out.println("produit = " + a*b);
		System.out.println("division = " + b/a);
		
		s += conc;
		
		System.out.println("concaténation : " + s);

		boolean bool = a%2==0?true:false;
		System.out.println("a est pair : "+ bool);
		bool = b%2==0?true:false;
		System.out.println("b est pair : "+ bool);
		bool = (a%2==0?true:false||b%2==0?true:false);
		System.out.println("a ou b est pair : "+ bool);


		System.out.println("cooldown = " + countdown);
		countdown--;
		System.out.println("cooldown = " + countdown);
		
	}

}
