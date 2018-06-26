package com.java.tp1;

public class NombresPremiersTableau {

	public static void main(String[] args) {
        int[] tab = {1, 9, 31, 3, 4, 11, 341, 527, 1607};
        affiche(tab);
        System.out.println("Nombres premiers : ");
        affiche(NombresPremiers(tab));
    }

    public static void affiche (int[] tab) {
        for (int i = 0; i<tab.length; i++) {
            if(tab[i]!=0) {
                System.out.println(tab[i]);
            } else {
            	break;
            }
        }
    }

    public static int[] NombresPremiers (int[] tab) {
        int[] tabReturn = new int[tab.length];
        int indice = 0;
        boolean premier = true;
        for (int i = 0; i<tab.length; i++){
            for (int j = 2; j<((tab[i])^1/2); j++) {
                if (tab[i]%j==0) {
                    premier = false;
                    break;
                }
            }
            if (tab[i]==1) {
            	premier = false;
            }
            if (premier) {
                tabReturn[indice] = tab[i];
                indice++;
            }
            premier = true;
        }
        return tabReturn;
    }
}
