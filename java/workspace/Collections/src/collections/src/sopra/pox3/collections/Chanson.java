package collections.src.sopra.pox3.collections;

import java.util.List;

public class Chanson {

	private String nom;
	private int duree;

	public Chanson(String nom, int duree) {
		this.nom = nom;
		this.duree = duree;

	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public void afficher() {
		System.out.println(nom + "( " + duree + " s)");
	}

	public List<Chanson> getChansons() {
		System.out.println(nom + "( " + duree + " s)");
		return null;
	}

}
