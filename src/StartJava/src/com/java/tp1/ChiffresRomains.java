package com.java.tp1;

import java.util.Scanner;

public class ChiffresRomains {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nb;
		System.out.println("Entrez un nombre entre 1 et 999");
		do{
			nb = sc.nextLine();
		} while (nb.length()<=3);
			System.out.println(Integer.parseInt(nb)-((Integer.parseInt(nb)/100)*100)-((Integer.parseInt(nb)/10)*10) + " unités");
			int n = Integer.parseInt(nb); 
		if (n < 1000 && n > 99) {
		System.out.println(centainesRomain(Integer.parseInt(nb)/100) + dizainesRomain(Integer.parseInt(nb)/10) + unitesRomain(Integer.parseInt(nb)));
		} else if (n > 9) {
		System.out.println(dizainesRomain((Integer.parseInt(nb)/10)-(Integer.parseInt(nb)/100)*10) + unitesRomain(Integer.parseInt(nb)));
		} else {
		System.out.println(unitesRomain(Integer.parseInt(nb)));
		}
		
		sc.close();
	}
		

		static String unitesRomain (int unite) {
			switch(unite) {
			case 1 :
				return "I";
			
			
			case 2 :
				return "II";
			
			
			case 3 :
				return "III";
			
			
			case 4 :
				return "IV";
			
			
			case 5 :
				return "V";
			
			
			case 6 :
				return "VI";
			
			
			case 7 :
				return "VII";
			
			
			case 8 :
				return "VIII";
			
			
			case 9 :
				return "IX";
			
			
			default :
				return "";
			
			}
		}
		
		static String dizainesRomain (int dizaine) {
			switch(dizaine) {
			case 1 :
				return "X";
			
			
			case 2 :
				return "XX";
			
			
			case 3 :
				return "XXX";
			
			
			case 4 :
				return "XL";
			
			
			case 5 :
				return "L";
			
			
			case 6 :
				return "LX";
			
			
			case 7 :
				return "LXX";
			
			
			case 8 :
				return "LXXX";
			
			
			case 9 :
				return "XC";
			
			
			default :
				return "";
			
			}
		}
		
		static String centainesRomain (int centaine) { //centaines
			switch(centaine) {
			case 1 :
				return "C";
			
			
			case 2 :
				return "CC";
			
			
			case 3 :
				return "CCC";
			
			
			case 4 :
				return "CD";
			
			
			case 5 :
				return "D";
			
			
			case 6 :
				return "DC";
			
			
			case 7 :
				return "DCC";
			
			
			case 8 :
				return "DCCC";
			
			
			case 9 :
				return "MC";
				
			default :
				return "";
			}
		}
	}
