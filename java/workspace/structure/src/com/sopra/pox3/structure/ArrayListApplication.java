package com.sopra.pox3.structure;

import java.util.ArrayList;

public class ArrayListApplication {

	public static void main(String[] args) {
	
		ArrayList<String> nameList = new ArrayList<>(); // contrainte de mettre que des string dans le tableau, ce sont des génériques
		// a chaque fois qu'on veut creer un pointeur dans la mémoire (heap) on fait un new cela se fait tres souvent
		nameList.add("Jo"); // pour verifier si tableau créé est grand
		nameList.add("Jack"); // soit j'ai une liste qui va détourner le probleme et continuer a mettre en mémoire ailleurs: ce sont les listes liées
		nameList.add("John"); // soit si je déborde j'en créé un plus loin en reprenant les éléments, il alloue et désalloue, mais sa peut perdre en efficacité
		nameList.add("Jim"); // le cas se pose pour les très grandes listes >1000 éléments
		nameList.add("Jo");
		nameList.add("Jo");
		nameList.add("Jack");
		nameList.add("John");
		nameList.add("Jim");
		nameList.add("Jo");	
		nameList.add("Jack");
		nameList.add("John");
		nameList.add("Jim");
		nameList.add("Jo");	
		nameList.add("Jack");
		nameList.add("John");
		nameList.add("Jim");
		nameList.add("Jo");
		System.out.println(nameList);
	}

}
