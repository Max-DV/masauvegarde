package collections.src.sopra.pox3.collections;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil.ToStringAdapter;

import jdk.nashorn.internal.ir.CatchNode;

public class CollectionApplication {

	private static final String FILE_PATH = "bibliotheque.txt";

	public static void main(String[] args)
			throws IOException/* throws DisqueExisteDejaException */, DisqueExisteDejaException {

		Bibliotheque bibliotheque = new Bibliotheque();
		Disque disque = new Disque("Alea jecta est", "5657");

		disque.addChanson(new Chanson("Intro", 30));
		disque.addChanson(new Chanson("Xplosive", 25));
		disque.addChanson(new Chanson("StillDre", 7));
		disque.addChanson(new Chanson("Encore", 80));

		bibliotheque.addDisques(disque);

		Disque disque2 = new Disque("the massacre", "5475");
		disque2.addChanson(new Chanson("disco inferno", 36));
		disque2.addChanson(new Chanson("straight outta control", 3));
		disque2.addChanson(new Chanson("PIMP", 14));
		disque2.addChanson(new Chanson("candyshop", 15));

		bibliotheque.addDisques(disque2);

		Disque disque3 = new Disque("yo", "100");
		disque3.addChanson(new Chanson("d1", 36));
		disque3.addChanson(new Chanson("d2", 3));
		disque3.addChanson(new Chanson("d3", 14));
		disque3.addChanson(new Chanson("d4", 15));

		bibliotheque.addDisques(disque3);

		bibliotheque.afficherDisques();
		System.out.println(bibliotheque.getNbDisques());

		while (true)

		{
			System.out.println("1.Liste des disques");
			System.out.println("2. Détail d'un disque");
			System.out.println("3. Recherche de chanson");
			System.out.println("4. Retire un disque");
			System.out.println("5. Ajouter un disque");
			System.out.println("6. Sauvegarde les données");
			System.out.println("7. Charge les données");
			System.out.println("Q. Quitter");

			String saisie = Saisie.saisie("Quel est ton choix?");

			switch (saisie) {
			case "1":
				bibliotheque.afficherDisques();
				break;

			case "2":
				String codeBarre = Saisie.saisie("code barre steuplé");
				Disque disqueTrouve = bibliotheque.getDisque(codeBarre);
				if (disqueTrouve == null)
					System.out.println("Pas de disque avec ce codebarre");
				else
					disqueTrouve.afficherDetails();
				break;

			case "3":
				String chansonRecherchee = Saisie.saisie("Quelle chanson voulez vous?");
				List<Chanson> chansons = bibliotheque.rechercherChansons(chansonRecherchee);
				if (chansons == null || chansons.isEmpty()) {
					System.out.println("Pas de chanson");
				} else {
					for (Chanson chanson : chansons) {
						chanson.afficher();
					}
				}

				break;

			case "4":
				String codeBarreDisqueRecherche = Saisie.saisie("code barre steuplé");
				boolean disqueEfface = bibliotheque.retirerDisque(codeBarreDisqueRecherche);
				if (disqueEfface) {
					bibliotheque.afficherDisques();
				} else {
					System.out.println("Pas de disque");
					bibliotheque.afficherDisques();
				}
				break;

			case "5":
				String nomDisqueAjouter = Saisie.saisie("Nom du disque?");
				String codeBarreAjouter = Saisie.saisie("Code Barre du disque?");
				Disque disqueAjout = new Disque(nomDisqueAjouter, codeBarreAjouter);

				while (true) {
					Chanson chanson = saisieChanson();
					if (chanson != null) {
						disqueAjout.addChanson(chanson);

					} else {
						break;
					}
				}
				try {

					bibliotheque.ajouterDisque(disqueAjout);
				
					System.out.println("Le disque a été ajouté");
				} catch (DisqueExisteDejaException e) {
					System.out.println("Impossible d'ajouter le disque");
				}

				break;

			case "6":

				sauvegarderDonnees(bibliotheque);
				System.out.println("Données sauvegardées");

				break;

			case "7":
				chargerDonnees(bibliotheque);
				System.out.println("Données chargées");
				break;
			case "Q":
			case "q":
				System.exit(0);

				break;

			default:
				System.out.println("Ce choix n'existe pas!");
			}

		}
	}

	private static void chargerDonnees(Bibliotheque bibliotheque)  // lire
																	// fichier
																	// disque
	{
		File file = new File(FILE_PATH);

		FileInputStream fis;
		try {
			fis = new FileInputStream(file);

			InputStreamReader isr = new InputStreamReader(fis, "UTF8");

			BufferedReader reader = new BufferedReader(isr);

			while (true)

			{
				String nom = reader.readLine(); // nom
				if (nom == null)
					break;
				String codeBarre = reader.readLine(); // codeBarre
				int nbChanson = Integer.parseInt(reader.readLine());
				Disque disque = new Disque(nom, codeBarre); // creer objet
															// Disque
				for (int i = 0; i < nbChanson; i++) {
					String nomChanson = reader.readLine();
					int dureeChanson = Integer.parseInt(reader.readLine());

					Chanson chanson = new Chanson(nomChanson, dureeChanson);
					disque.addChanson(chanson);

				}
				bibliotheque.addDisques(disque);
			}

			reader.close();

			isr.close();

			fis.close();
		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		catch (IOException e) {
			e.printStackTrace();
		} 
	}

	private static void sauvegarderDonnees(Bibliotheque bibliotheque)

	{
		try {
			File file = new File(FILE_PATH);

			PrintWriter writer = new PrintWriter(file, "UTF8");

			for (Disque disque : bibliotheque.disques) {
				writer.println(disque.getNom());
				writer.println(disque.getCodeBarre());
				writer.println(disque.getChansons().size());

				for (Chanson chanson : disque.getChansons()) {
					writer.println(chanson.getNom());
					writer.println(chanson.getDuree());
				}
			}

			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static Chanson saisieChanson() {

		String nom = Saisie.saisie("Quel est le nom de la chanson?");
		if (nom == null || nom.isEmpty())
			return null;
		int duree = Saisie.saisieInt("Quelle est la duree?");
		return new Chanson(nom, duree);
	}
}