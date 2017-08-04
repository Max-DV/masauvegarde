package com.sopra.pox3.base.collection;



import java.util.List;

import madagascar.Penguin;

public class ListApplication {

	public static void main(String[] args) {
		
		new ListApplication().init();
		
	}
	
	void init() {
	Penguin skipper = new Penguin("Commandant", 15);
	Penguin kowalski = new Penguin("Kowalski", 8);
	Penguin rico = new Penguin("Rico", 21);
	Penguin soldat = new Penguin("Soldat", 6);

	Penguin[] allPenguins = {rico, skipper, soldat, kowalski};
	PenguinTeam team= new PenguinTeam(allPenguins);
	
	System.out.println(team.penguins);
	System.out.println(team.next());
	System.out.println(team.next());
	System.out.println(team.next());
	System.out.println(team.next());
	System.out.println(team.next());
	System.out.println(team.next());
	System.out.println(team.next());
	System.out.println(team.next());
	
	List<Penguin>penguins = team.getPenguins();
	System.out.println(penguins);
	}
	
}

