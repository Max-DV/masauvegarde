package ordinateur.src.sopra.pox3.ordinateur;

public class DisqueDur {

	private int capacit�;

	public DisqueDur(int capacit�) {
		this.capacit� = capacit�;
	}

	public void demarrer() {
		System.out.println("D�marrage disque dur " + capacit�);

	}

	public void lire() {
		System.out.println("Lecture disque dur " + capacit�);
	}		

	public void eteindre() {

		System.out.println("Extinction disque dur " + capacit�);

	}
}
