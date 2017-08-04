package com.sopra.pox3.structure;

import java.util.Arrays;

public class StructureApplication {
	
	public static void main(String[] args){
	String[] names = {"Jo", "Jack","John", "Jim"}; // contrairement a c c'est un tableau fini
	
	System.out.println(Arrays.toString (names));	// systeme: tout ce qui est en dehors de la machine virtuelle; out permet de sortir sur l'ecran ou l'imprimante ..., println passe a ligne suivante
	// on a des classes utilitaires qui vont commencer par s
	// array importe le fichier java.util.arrays 
	//names[4] = "Jane"; // en c on a un pointeur, qqch a coté, le tableau *array, si on fait array + qqch si ya deja qqch sa ecrase, sur java, la taille est limité et ça ecrasera pas
	

	}
}
