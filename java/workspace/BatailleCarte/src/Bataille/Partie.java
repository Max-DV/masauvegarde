package Bataille;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Partie {

	public static void main (String[] args){

		
		FabriqueDeck deck52= new FabriqueDeck();
		FabriqueDeck deck32= new FabriqueDeck();
		
		System.out.println(deck52.creerDeck52().toString());
		System.out.println(deck32.creerDeck32().toString());
		
		Joueur joueur1 = new Joueur("Joueur1");
		Joueur joueur2 = new Joueur("Joueur2");
		
		Carte carte = new Carte(8, Couleur.COEUR);
		
		
		
		while(joueur1.getCarte().size() != 0 && joueur2.getCarte().size() != 0) {
			
	
			Carte carteJ1 = joueur1.getCarte().get(0);
			joueur1.prendCarte(carteJ1);
		
			Carte carteJ2 = joueur2.getCarte().get(0);
			joueur2.prendCarte(carteJ2);
		

		
	
	}

	//deroulerPartie(J1: Joueur, j2:Joueur) : genere 1 deck() melange le deck distribue les cartes, boucle de jeu

	
}}
