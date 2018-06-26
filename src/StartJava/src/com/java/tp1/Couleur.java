package com.java.tp1;

public enum Couleur {
BLEU, ROUGE, VERT, GRIS, NOIR; //toujours en majuscules
}
					//on peut comparer les éléments d'une énum avec les opérateurs relationnels
					// pour comparer un String avec un élément d'une enum : 
					//"BLEU".equals(Couleur.BLEU.toString());