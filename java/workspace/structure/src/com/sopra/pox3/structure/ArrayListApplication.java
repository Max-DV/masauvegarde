package com.sopra.pox3.structure;

import java.util.ArrayList;

public class ArrayListApplication {

	public static void main(String[] args) {
	
		ArrayList<String> nameList = new ArrayList<>(); // contrainte de mettre que des string dans le tableau, ce sont des g�n�riques
		// a chaque fois qu'on veut creer un pointeur dans la m�moire (heap) on fait un new cela se fait tres souvent
		nameList.add("Jo"); // pour verifier si tableau cr�� est grand
		nameList.add("Jack"); // soit j'ai une liste qui va d�tourner le probleme et continuer a mettre en m�moire ailleurs: ce sont les listes li�es
		nameList.add("John"); // soit si je d�borde j'en cr�� un plus loin en reprenant les �l�ments, il alloue et d�salloue, mais sa peut perdre en efficacit�
		nameList.add("Jim"); // le cas se pose pour les tr�s grandes listes >1000 �l�ments
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
