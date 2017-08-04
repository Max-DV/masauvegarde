package madagascar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PenguinApplication {

	public static void main(String[] args) {
//		
//		Penguin p1= new Penguin("Tux", 32);
//		Penguin p2= new Penguin ("Tux2");
//		Penguin p3= new Penguin("Tux3", 12);
//		
//		Penguin p4= new Penguin("", 20);
//		System.out.println("My penguin has empty name");

		
		
		List<Penguin> penguins = new ArrayList<>();

		Penguin skipper = new Penguin("Commandant", 15);
		Penguin kowalski = new Penguin("Kowalski", 8);
		Penguin rico = new Penguin("Rico", 21);
		Penguin soldat = new Penguin("Soldat", 6);


		
		penguins.add(skipper);
		penguins.add(kowalski);
		penguins.add(rico);
		penguins.add(soldat);

		System.out.println(penguins);
		Collections.sort(penguins);
		System.out.println(penguins);

		Collections.sort(penguins, new Comparator<Penguin>() {

			@Override
			public int compare(Penguin p1, Penguin p2) {

				return p1.speed.compareTo(p2.speed);
			}
		});
		System.out.println(penguins);
		Emperor napoleon = new Emperor("napoleon");
		System.out.println(napoleon);
		napoleon.slide();
		napoleon.slide(skipper);
		
		Emperor charlemagne = new Emperor("Charlemagne");
		charlemagne.slide(napoleon);

		System.out.println("=== Coomplex stuff ==");

		Penguin p= napoleon;
		p= skipper;
		p= napoleon;
		System.out.println(p.getClass().getSimpleName());
		p.slide(); 
		
		p=charlemagne;
		napoleon.slide(p); // donc faut privilégié l'overriding!!
	}
}