import java.util.ArrayList;
import java.util.Collections;

public class Bataille {

	public static void main(String[] args) {
		// INITIALISATION DE DEUX JOUEURS
		Joueur joueur1 = new Joueur("Joueur1");
		Joueur joueur2 = new Joueur("Joueur2");
		
		// INITIALISATION D'UNE LISTE DE CARTE
		ArrayList<Carte> paquet = new ArrayList<Carte>();
		
		// INITIALISATION DU PAQUET DE CARTES
		for(int i = 0 ; i < Carte.tabCouleur.length ; i++) {
			for(int j = 0 ; j < Carte.tabValeur.length; j++) {
				Carte carte = new Carte(Carte.tabCouleur[i], Carte.tabValeur[j]);
				paquet.add(carte);				
			}
		}
		
		// MELANGE LE PAQUET
		Collections.shuffle(paquet);
		
		// DISTRIBUTION DES CARTES POUR CHAQUE JOUEUR
		for(int k = 0 ; k < paquet.size(); k = k + 2) {
			joueur1.ajouteUneCarte(paquet.get(k));
			joueur2.ajouteUneCarte(paquet.get(k+1));
		}
		
		// JEU
		// TANT QUE LA TAILLE DES PAQUETS SONT DIFFERENTS DE 0
		while(joueur1.getCarte().size() != 0 && joueur2.getCarte().size() != 0) {
			
			// RECUPERE LA PREMIERE CARTE DU PAQUET DU JOUEUR1
			Carte carteJ1 = joueur1.getCarte().get(0);
			joueur1.tireUneCarte(carteJ1);
			// RECUPERE LA PREMIERE CARTE DU PAQUET DU JOUEUR2
			Carte carteJ2 = joueur2.getCarte().get(0);
			joueur2.tireUneCarte(carteJ2);
			
			// SI LA VALEUR DE LA CARTE DU JOUEUR1 EST SUPERIEURE
			if(carteJ1.comparateur(carteJ2) == 1) {
				System.out.println(carteJ1.toString() + " contre " + carteJ2.toString());
				joueur1.ajouteUneCarte(carteJ1);
				joueur1.ajouteUneCarte(carteJ2);
				joueur1.gagner();
				System.out.println(joueur1.getNom() + " gagné ! Score : " + joueur1.getScore());
				System.out.println(joueur2.getNom() + " perdu ! Score : " + joueur2.getScore());
			}
			
			// SI LA VALEUR DE LA CARTE DU JOUEUR2 EST SUPERIEURE
			else if(carteJ1.comparateur(carteJ2) == 0) {
				System.out.println(carteJ1.toString() + " contre " + carteJ2.toString());
				joueur2.ajouteUneCarte(carteJ2);
				joueur2.ajouteUneCarte(carteJ1);
				joueur2.gagner();
				System.out.println(joueur1.getNom() + " perdu ! Score : " + joueur1.getScore());
				System.out.println(joueur2.getNom() + " gagné ! Score : " + joueur2.getScore());
			}
			// SI LA VALEUR DES CARTES SONT EGALES
			else {
				System.out.println(carteJ1.toString() + " contre " + carteJ2.toString());
				System.out.println("** Egalité ! ");
				
				// SI LES JOUEURS ONT AU MOINS 2 CARTES DANS LEUR PAQUET
				if(joueur1.getCarte().size() >= 2 && joueur2.getCarte().size() >= 2) {
					// RECUPERE 2 CARTE DANS LE PAQUET DU JOUEUR1
					Carte carte1 = joueur1.getCarte().get(0);
					Carte carte2 = joueur1.getCarte().get(1);
					joueur1.tireUneCarte(carte1);
					joueur1.tireUneCarte(carte2);
					// RECUPERE 2 CARTE DANS LE PAQUET DU JOUEUR2
					Carte carte3 = joueur2.getCarte().get(0);
					Carte carte4 = joueur2.getCarte().get(1);
					joueur2.tireUneCarte(carte3);
					joueur2.tireUneCarte(carte4);
				
					// SI LA VALEUR DE LA CARTE DU JOUEUR1 EST SUPERIEURE
					if(carte2.comparateur(carte4) == 1) {
						System.out.println(carte2.toString() + " contre " + carte4.toString());
						// LE JOUEUR1 RECUPERE LES 6 CARTES
						joueur1.ajouteUneCarte(carteJ1);
						joueur1.ajouteUneCarte(carteJ2);
						joueur1.ajouteUneCarte(carte1);
						joueur1.ajouteUneCarte(carte2);
						joueur1.ajouteUneCarte(carte3);
						joueur1.ajouteUneCarte(carte4);
						joueur1.gagner();
						System.out.println(joueur1.getNom() + " gagné ! Score : " + joueur1.getScore());
						System.out.println(joueur2.getNom() + " perdu ! Score : " + joueur2.getScore());
					}
					
					// SI LA VALEUR DE LA CARTE DU JOUEUR2 EST SUPERIEURE
					else if(carte2.comparateur(carte4) == 0) {
						System.out.println(carte2.toString() + " contre " + carte4.toString());
						// LE JOUEUR1 RECUPERE LES 6 CARTES
						joueur2.ajouteUneCarte(carteJ1);
						joueur2.ajouteUneCarte(carteJ2);
						joueur2.ajouteUneCarte(carte1);
						joueur2.ajouteUneCarte(carte2);
						joueur2.ajouteUneCarte(carte3);
						joueur2.ajouteUneCarte(carte4);
						joueur2.gagner();
						System.out.println(joueur2.getNom() + " gagné ! Score : " + joueur2.getScore());
						System.out.println(joueur1.getNom() + " perdu ! Score : " + joueur1.getScore());
					}
				}
				else {
					System.out.println("Impossible de jouer l'égalité !");
					if(joueur1.getCarte().size() < 2) {
						joueur2.gagner();
						System.out.println(joueur1.getNom() + " perdu ! Score : " + joueur1.getScore());
						System.out.println(joueur2.getNom() + " gagné ! Score : " + joueur2.getScore());
					}
					else if(joueur2.getCarte().size() < 2) {
						joueur1.gagner();
						System.out.println(joueur1.getNom() + " gagné ! Score : " + joueur1.getScore());
						System.out.println(joueur2.getNom() + " perdu ! Score : " + joueur2.getScore());
					}
				}
			}
			System.out.println();
		}
		
		// AFFICHAGE DU GAGNANT
		if(joueur1.getScore() > joueur2.getScore()) 
			System.out.println(joueur1.getNom() + " a gagné ! ");
		else if(joueur2.getScore() > joueur1.getScore()) 
			System.out.println(joueur2.getNom() + " a gagné ! ");
		else
			System.out.println("Egalité ! ");
	}

}