package com.sopra.pox3.inheritance;

public class Polychaeta extends MultipleCellular{

	String head = "[( | )]";
	
	public Polychaeta(int count){
		super(500);
	}
	
	
	public String getHead(){
		return head;
	}
	
}
