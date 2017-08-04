import java.util.ArrayList;

public class Joueur {

	// SCORE JOUEUR
	private int score;
	// LISTE DE CARTES
	private ArrayList<Carte> paquetJoueur;
	// NOM JOUEUR
	private String nom;

	/***
	 * CONSTRUCTEUR JOUEUR
	 * @param Nom
	 */
	public Joueur(String Nom)
	{
		this.score = 0;
		this.paquetJoueur = new ArrayList<Carte>();
		this.nom = Nom;
	}
	
	/***
	 * GETTER DU SCORE
	 * @return LE SCORE DU JOUEUR
	 */
	public int getScore()
	{
		return this.score;
	}
	
	/***
	 * GETTER DU NOM
	 * @return LE NOM DU JOUEUR
	 */
	public String getNom()
	{
		return this.nom;
	}
	
	/***
	 * GETTER DE LA LISTE DE CARTES
	 * @return LA LISTE DE CARTES
	 */
	public ArrayList<Carte> getCarte()
	{
		return this.paquetJoueur;
	}

	/***
	 * FONCTION TIREUNECARTE : SUPPRIME UNE CARTE DE LA LISTE DE CARTES
	 * @param carte
	 */
	public void tireUneCarte(Carte carte)
	{
		this.paquetJoueur.remove(carte);
	}
	
	/***
	 * FONCTION AJOUTEUNECARTE : AJOUTE UNE CARTE A LA LISTE DE CARTES
	 * @param carte
	 */
	public void ajouteUneCarte(Carte carte) 
	{
		this.paquetJoueur.add(carte);
	}
	
	/***
	 * FONCTION GAGNER : AUGMENTE LE SCORE DU JOUEUR
	 */
	public void gagner() 
	{
		this.score++;
	}
	
}