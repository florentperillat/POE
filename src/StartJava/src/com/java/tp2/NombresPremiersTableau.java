package com.java.tp2;

public class NombresPremiersTableau {

private static void main(String[] args) {

    int[] tab = {1, 2, 3, 4, 5};
    affiche(tab);
    affiche(NombresPremiers(tab));
        }

        public static void affiche (int[] tab) {
            for (int i = 0; i<tab.length; i++) {
                System.out.println(tab[i]);
            }
        }

        public static int[] NombresPremiers (int[] tab) {
            int[] tabReturn = {0};
            int indice = 0;
            boolean premier = true;
            for (int i = 0; i<tab.length; i++){
                for (int j = 2; j<tab[i]; j++) {
                    if (tab[i]%j==0) {
                        premier = false;
                        break;
                    }
                }
                if (premier) {
                    tabReturn[indice] = tab[i];
                }
                premier = true;
            }
            return tabReturn;
        }
}
