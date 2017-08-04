package com.sopra.pox3.base.autoboxing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AutoboxingApplication {

	public static void main(String[] args) {
		new AutoboxingApplication().init();
		new AutoboxingApplication().compare();
		new AutoboxingApplication().itsATrap();
		List<Boolean> list = new AutoboxingApplication().getTruths();
		System.out.println(list);
		System.out.println(list.get(0).compareTo(false));
	}

	public void init() {
		int x = 2;// primitive
		Integer y = 2;// wrapper
		Integer z = new Integer(2);
		System.out.println(x == y);
		System.out.println(x == z);
		z = new Integer(x); // No autoboxing, à la dure
		z = x; // autoboxing; the JVM (compiler) works for us

	}

	void compare() {
		Integer a = new Integer(12);
		Integer b = new Integer(12);
		System.out.println(a == b); // pas égal car ce ne sont pas des
									// primitives
		System.out.println("Equals?" + a.equals(b)); // egal car la on parle de
														// leur valeur

	}

	void itsATrap() {
		Integer a = 13; // pour le 13 elle voit un petit int, c'est pas un objet
						// donc ca va pas dans la heap, il stock juste la
						// variable a dans la heap
		Integer b = 13;

		System.out.println(a == b);
		System.out.println(a.compareTo(b));// l'avantage des grand integer c'est
											// qu'on peut utiliser des fonctions
											// de comparaison et creer des
											// méthode et des listes

		Integer x = 1000;
		Integer y = 1000;
		System.out.println(x == y);// do not use
		System.out.println(x.equals(y)); // Do use equals()
	}

	// Wrapper can specify a List
	List<Boolean> getTruths() {
		return Arrays.asList(true, false, false, true, false, true);
	}
}
