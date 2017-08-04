package collections.src.sopra.pox3.collections;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {

	List<Disque> disques = new ArrayList<>();

	public Bibliotheque() {
		disques = new ArrayList<>();
	}

	void ajouterDisque(Disque disque) throws DisqueExisteDejaException{
		if (getDisque(disque.getCodeBarre()) != null) {
			throw new DisqueExisteDejaException(disque);
		}

		disques.add(disque);

	}
	
	// boolean ajouterDisque (Disque disque){
	// for (Disque disqueAjout: disques)
	// if(disque.getCodeBarre().equals(disqueAjout.getCodeBarre())){
	// System.out.println("Code barre existant");
	// return false;
	// }else
	// {int nbChanson = Saisie.saisieInt("Nombre de chanson?");
	//
	//
	// for (int i = 0 ; i <nbChanson;i++){
	// String nomChansonAjoute = Saisie.saisie("Quelle chanson?");
	// int dureeChansonAjoute= Saisie.saisieInt("Duree de la chanson?");
	// disque.addChanson(new Chanson(nomChansonAjoute, dureeChansonAjoute));
	// }return true;
	// }
	//
	// return true;
	//
	// }

	public void afficherDisques() {
		System.out.println("Liste des disques de la bibliothèqe");
		System.out.println("Il y a" + disques.size() + "disque(s)");
		for (Disque disque : disques)
			disque.afficher();
	}

	boolean retirerDisque(String codeBarre) {

		for (Disque disque : disques)
			if (disque.getCodeBarre().equals(codeBarre)) {
				disques.remove(disque);
				System.out.println("Le disque: " + codeBarre + "a été supprimé");
				return true;
			}
		return false;

	}

	public int getNbDisques() {
		int nbDisques = disques.size();
		return nbDisques;

	}

	public Disque getDisque(String codeBarre) {

		for (Disque disque : disques) {
			String codeBarreDisque = disque.getCodeBarre();
			if (codeBarreDisque.equals(codeBarre))
				return disque;
		}
		return null;
	}



	public List<Chanson> rechercherChansons(String recherche) {

		recherche = recherche.toLowerCase();
		List<Chanson> resultat = new ArrayList<>();

		for (Disque disque : disques) {
			List<Chanson> ListedeChansons = disque.getChansons();

			for (Chanson chanson : ListedeChansons) {

				/*
				 * if (chanson.getNom().equalsIgnoreCase(recherche)) {
				 * resultat.add(chanson); }
				 */
				if (chanson.getNom().toLowerCase().contains(recherche))
					resultat.add(chanson);
			}

		}
		return resultat;

	}

	public void addDisques(Disque disque) {
		disques.add(disque);
	}

}
