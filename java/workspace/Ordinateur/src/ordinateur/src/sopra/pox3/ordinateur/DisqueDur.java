package ordinateur.src.sopra.pox3.ordinateur;

public class DisqueDur {

	private int capacité;

	public DisqueDur(int capacité) {
		this.capacité = capacité;
	}

	public void demarrer() {
		System.out.println("Démarrage disque dur " + capacité);

	}

	public void lire() {
		System.out.println("Lecture disque dur " + capacité);
	}		

	public void eteindre() {

		System.out.println("Extinction disque dur " + capacité);

	}
}
