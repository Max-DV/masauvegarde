package ordinateur.src.sopra.pox3.ordinateur;

public class Ordinateur {

	private String modele;
	private Ram memoireVive;
	private DisqueDur[] disquesDurs;

	public Ordinateur(String modele, int capaciteMemoire, int[] capacitesDisquesDurs) {
		this.modele = modele;
		memoireVive = new Ram(capaciteMemoire);

		disquesDurs = new DisqueDur[capacitesDisquesDurs.length];
		for (int i = 0; i < capacitesDisquesDurs.length; i++)
			disquesDurs[i] = new DisqueDur(capacitesDisquesDurs[i]);
	}

	public void demarrer() {

		System.out.println("L'ordinateur démarre");

		if (memoireVive == null) {
			System.out.println("Arg no memory");
			return;
		}
		memoireVive.initialiser();
		System.out.println("Demarrage des disques durs");
		for (DisqueDur disqueDur : disquesDurs)
			disqueDur.demarrer();
		if (disquesDurs.length > 0) {
			disquesDurs[0].lire();
			System.out.println("Ordinateur en service");
		} else {
			System.out.println("Please insert a boot disk and press a key to continue");
		}

	}

	public void eteindre() {

		System.out.println("Extinction des disques durs");
		for (int i = disquesDurs.length - 1; i >= 0; i--) {
			disquesDurs[i].eteindre();
		}
		System.out.println("Les disques sont éteints");
		memoireVive.eteindre();
		System.out.println("Ordinateur éteint");
	}
}
