package Bataille;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FabriqueDeck {

	
	int INITIAL_SIZE_52 = 52;
	int INITIAL_SIZE_32 = 32;
	int valeur;
	Couleur couleur;

	// INITIALISATION D'UNE LISTE DE CARTE
	List<Carte> Deck = new ArrayList<>();


	public List<Carte> creerDeck52() {
int valeur= INITIAL_SIZE_52/4 +1;
		for (Couleur couleur : Couleur.values()) {

			for (int i = 2; i <= valeur; i++)
				
		 {
				Carte carte = new Carte(i, couleur);
				Deck.add(carte);
				
			}
		}
		return Deck;
		
	}
	public List<Carte> creerDeck32() {
int valeur= INITIAL_SIZE_32/4 +1;
		for (Couleur couleur : Couleur.values()) {

			for (int i = 7; i <= 14; i++)
				
		 {
				Carte carte = new Carte(i, couleur);
				Deck.add(carte);
				
			}
		}
		return Deck;

	}
}