package ordinateur.src.sopra.pox3.ordinateur;

public class Ram {

	private int capacit�;

	public Ram(int capacit�) {
		this.capacit� = capacit�;
	}

	public void initialiser() {
		System.out.println("Initialisation m�moire "+ capacit� + "Go");

	}

	public void eteindre() {
		System.out.println("Extinction m�moire vive");

	}

}
