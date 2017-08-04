package Bataille;


public class Carte {


	Couleur couleur;
	int valeur;

	public Carte (int valeur, Couleur couleur){
		this.couleur= couleur;
		this.valeur= valeur;
	}




	public Carte() {

	}




	public Couleur getCouleur() {
		return this.couleur;
	}

	public int getValeur() {
		return this.valeur;
	}

//	public int comparateur(Carte carte2) {
//		// return (this.valeur == carte2.GetValeur()) ? 2 :
//		// ((this.valeur>carte2.GetValeur()) ? 1 : 0);
//		if (this.valeur == carte2.getValeur())
//			return 2;
//		else if (this.valeur > carte2.getValeur())
//			return 1;
//		else
//			return 0;
//	}
//
//	public String toString() {
//		return this.valeur + " de " + this.couleur;
//	}
@Override
public String toString() {

	return "Carte [" +valeur +" "+couleur+"]";
}
}