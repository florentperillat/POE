package com.java.tp2;

public class Multiplication {

	public static void main(String[] args) {
		int[] tab = {1, 2, 3, 5, 7, 11, 13, 17, 19, 23};

		System.out.println(multiply(tab));
		
	}

	public static int[] multiply (int[] tab) {
	    int[] tab2 = new int[tab.length-1];
	    	if(tab[0]!=0&&tab[1]!=0) {
	    		tab2[0]=tab[0]*tab[1];
	    	} else {
	    		tab2[0]=tab[0];
	    	}
	    	for(int i = 1; i<tab.length-1; i++) {
	    		tab2[i]=tab[i+1];
	    	}
	        return multiply(tab2);
	    }
	
/*	public int mult(int[] tab) {
		int 
	} */
	}
