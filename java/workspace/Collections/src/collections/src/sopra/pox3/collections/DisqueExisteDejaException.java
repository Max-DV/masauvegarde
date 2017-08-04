package collections.src.sopra.pox3.collections;

public class DisqueExisteDejaException extends Exception {

	public DisqueExisteDejaException(Disque disqueEnErreur) {
		super("Existe deja (" + disqueEnErreur.getCodeBarre() + ")");

	}

}
