package com.sopra.pox3.base.object;

import com.sopra.pox3.base.object.encapsulation.King;

public class Emperor extends King {
	
	public Emperor(String name) {
		super(name);
	
		People taleyrand = new People("Taleyran", 54);
		this.command(taleyrand);
	}
	@Override
	protected void command(People p){
		System.out.println("Shame! "+ p.getName() + " Shame!");
}
}