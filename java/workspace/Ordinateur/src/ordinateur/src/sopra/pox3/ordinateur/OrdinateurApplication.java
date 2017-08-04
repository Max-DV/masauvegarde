package ordinateur.src.sopra.pox3.ordinateur;

public class OrdinateurApplication {

	public static void main(String[] args) {

		for (int i=0 ; i<1000; i++){
		Ordinateur o = new Ordinateur("Rog", 25, new int[] { 100, 1000 });

		o.demarrer();
		System.out.println();
		o.eteindre();
		System.out.println();
	}
	}
}
