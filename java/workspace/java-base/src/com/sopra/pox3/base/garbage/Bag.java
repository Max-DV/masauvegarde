package com.sopra.pox3.base.garbage;

public class Bag {

	int weight;
	
	//String memoryFill= "deôivnrtindvnkjnfoirnfrionroneiondkn'okncknr,fk,lkre,skn,fkrnxngrlknjvnrfsijfzkenfsvrnnen";
	public Bag(int weight) {
		this.weight = weight;
	}
	@Override
	public String toString(){
		return "Bag" + this.weight;
	}
	
	@Override
	protected void finalize() throws Throwable{
		System.out.println("Killing" + this.toString());
	}
	
}
