package Bataille;

import java.util.ArrayList;

public class Joueur {

	private int score;
	private ArrayList<Carte> main;
	private String nom;

	public Joueur(String nom) {
		this.score = 0;
		this.main = new ArrayList<Carte>();
		this.nom = nom;
	}
	public ArrayList<Carte> getCarte()
	{
		return this.main;
	}
	public void prendCarte(Carte carte) {
		this.main.add(carte);
	}

	public Carte donneCarte() {
	Carte carteChoisi= new Carte();
		this.main.remove(0);
		return carteChoisi;
	}
	public int getScore(){
		return this.score;
	}
	public char[] setMain(FabriqueDeck deck32) {
	
		return null;
	}
}
