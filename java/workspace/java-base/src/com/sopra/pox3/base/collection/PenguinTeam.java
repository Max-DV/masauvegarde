package com.sopra.pox3.base.collection;



import java.util.List;

import madagascar.Penguin;

public class PenguinTeam {
	int count;
	
	List<Penguin> penguins= new CircularList<>();
	
	//varargs public PenguinTeam(Penguin... allPenguins){
	
	public PenguinTeam(Penguin[] allPenguins){
		
	/*	for (int i = 0 ; i < allPenguins.length; i++){
			penguins.add(allPenguins[i]);
		} */
		for (Penguin p : allPenguins){
			this.penguins.add(p);
		}
	}

	public Penguin next(){

//		Iterator<Penguin> team = penguins.iterator();
//		    while(team.hasNext())
//		      System.out.println(team.next());

		return  this.penguins.iterator().next();
		}
	
	public List<Penguin> getPenguins() {
		return penguins;
	}
	}

