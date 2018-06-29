package com.java.tp1;

import java.util.Scanner;

public class exercice3Mercredi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Combien de notes souhaitez-vous saisir ?");
		int nbNotes = sc.nextInt();
		int[] tabNotes = new int[nbNotes];
		int minNote = tabNotes[0];
		int maxNote = tabNotes[0];
		float moyNotes = 0;
		for(int i=0; i<nbNotes; i++) {
			System.out.printf("Saisissez la note %d ", i+1);
			tabNotes[i] = sc.nextInt();
			moyNotes+=tabNotes[i];
			if (minNote>tabNotes[i]) {
				minNote=tabNotes[i];
			} else if (i==0) {
				minNote = tabNotes[0];
			}
			if (maxNote<tabNotes[i]) {
				maxNote=tabNotes[i];
			}
		}
		moyNotes=moyNotes/(float)nbNotes;
		System.out.printf("Note minimale : %d %nNote maximale : %d %nMoyenne des notes : %f", minNote, maxNote, moyNotes);
		sc.close();
	}

}
