public class Carte {

	// VARIABLE COULEUR DE CARTE
	private String couleur;
	// VARIABLE VALEUR DE CARTE
	private int valeur;
	// TABLEAU DES COULEURS DE CARTE
	public static String[] tabCouleur = new String[] {"Coeur","Trèfle","Pique","Carreau"};
	// TABLEAU DE VALEURS DE CARTE
	public static int[] tabValeur = new int[] {2,3,4,5,6,7,8,9,10,11,12,13,1};
	
	/***
	 * CONSTRUCTEUR CARTE
	 * @param Couleur
	 * @param Valeur
	 */
	public Carte(String Couleur, int Valeur)
	{
		this.couleur = Couleur;
		this.valeur = Valeur;
	}
	
	/***
	 * GETTER DE LA COULEUR DE LA CARTE
	 * @return LA COULEUR DE LA CARTE
	 */
	public String getCouleur()
	{
		return this.couleur;
	}
	
	/***
	 * GETTER DE LA VALEUR DE LA CARTE
	 * @return LA VALEUR DE LA CARTE
	 */
	public int getValeur()
	{
		return this.valeur;
	}
	
	/***
	 * FONCTION COMPARATEUR : COMPARE LA VALEUR DE LA CARTE COURANTE AVEC LA VALEUR DE LA CARTE EN PARAMETRE
	 * @param carte2
	 * @return 2 SI LES VALEURS SONT IDENTIQUES
	 * @return 1 SI LA VALEUR DE LA CARTE COURANTE EST SUPERIEURE A LA VALEUR DE LA CARTE EN PARAMETRE
	 * @return 0 SINON
	 */
	public int comparateur(Carte carte2)
	{
		//return (this.valeur == carte2.GetValeur()) ? 2 : ((this.valeur>carte2.GetValeur()) ? 1 : 0);
		if(this.valeur == carte2.getValeur())
			return 2;
		else if(this.valeur > carte2.getValeur())
			return 1;
		else 
			return 0;
	}
	
	/***
	 * FONCTION TOSTRING : AFFICHAGE DE LA VALEUR ET DE LA COULEUR DE LA CARTE
	 * @return CHAINE
	 */
	public String toString()
	{
		return this.valeur + " de " + this.couleur;
	}
	
}