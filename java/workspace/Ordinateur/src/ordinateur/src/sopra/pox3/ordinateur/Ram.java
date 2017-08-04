package ordinateur.src.sopra.pox3.ordinateur;

public class Ram {

	private int capacité;

	public Ram(int capacité) {
		this.capacité = capacité;
	}

	public void initialiser() {
		System.out.println("Initialisation mémoire "+ capacité + "Go");

	}

	public void eteindre() {
		System.out.println("Extinction mémoire vive");

	}

}
