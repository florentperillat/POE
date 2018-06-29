package com.java.tp1;

public class ExerciceTableau {

	public static void main(String[] args) {
		double[] tab1 = {-9.5,1,-98.75,486};
		double[] tab2 = {1, 0, 3, 19, -5.6, 18, 10, 1, 0, 0, 9};
		double[][] tab3 = {{1,3,5,4.8},{0},{20,21,0.1}};
		affiche(tab1);
		System.out.println("Somme des éléments de tab1 = " + sum(tab1));
		System.out.println("Minimum de tab1 = " + min(tab1));
		affiche(tab2);
		System.out.println("Somme des éléments de tab2 = " + sum(tab2));
		System.out.println("Minimum de tab2 = " + min(tab2));
		affiche(merge(tab1,tab2));
		affiche(tab3[0]);
		affiche(tab3[1]);
		affiche(tab3[2]);
		System.out.println("Maximum de tab3 : " + max(tab3));
		

	}

	public static void affiche(double[] tab) {
		for (int i = 0; i<tab.length-1; i++) {
			System.out.print(tab[i]+", ");
		}
		System.out.println(tab[tab.length-1]);
	}
	
	public static double sum (double[] tab) {
		double sum = 0;
		for (int i = 0; i<tab.length; i++) {
			sum += tab[i];
		}
		return sum;
	}
	
	public static double min (double[] tab) {
		double min = tab[0];
		for (int i = 0; i<tab.length; i++) {
			if(tab[i]<min) {
				min = tab[i];
			}
		}
		return min;
	}
	
	public static double[] merge (double[] tab1, double[] tab2) {
//		double[] tab1long = new double[tab1.length+tab2.length];
//		double[] tab2long = new double[tab1.length+tab2.length];
//		for(int i = 0; i<tab1.length; i++) {
//			tab1long[i]=tab1[i];
//		}
//		for(int i = 0; i<tab2.length; i++) {
//			tab2long[i]=tab2[i];
//		}
//		double[] tab3 = new double[tab1.length];
//		for(int i = 0; i<tab3.length; i++) {
//			tab3[i]=tab1long[i];
//			tab3[i+1]=tab2long[i];
//		}
		
		if(tab1.length>tab2.length) {
			double[] tab3 = new double[tab1.length+tab2.length];
			for(int j =0; j<tab1.length;j++) {
				for(int i = 0; i<tab2.length; i++) {
					tab3[j]=tab1[i];
					j++;
					tab3[j]=tab2[i];
				}
			}
			return tab3;
		} else {
			double[] tab3 = new double[tab1.length+tab2.length];
			for(int j =0; j<tab2.length;j++) {
				for(int i = 0; i<tab1.length; i++) {
					tab3[j]=tab1[i];
					j++;
					tab3[j]=tab2[i];
				}
			}
			return tab3;
		}
	}
	
	public static double max (double[][] tab) {
		double max = 0;
		for(int i = 0; i<tab.length; i++) {
			for(int j = 0; j<tab[i].length; j++) {
				if (max<tab[i][j]) {
					max=tab[i][j];
				}
			}
		}
		return max;
	}
//	public static double[] merge2 (double[] tab1, double[] tab2) {
//		
//		double[] tab3 = new double[tab1.length+tab2.length];
//		int indiceTab3 = 0;
//		int indiceTab1etTab2 = 0;
//		while (indiceTab3<tab1.length+tab2.length) {
//			return tab3;
//		}
//	}
}