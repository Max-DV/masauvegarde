package com.sopra.pox3.base.object;

public class People {

	String name; // attributs
	int age;
	static int maxAge = 120;
	
	public People(String name, int age) { // constructeur

		this.name = name;
		this.age = age;
	}

	int birthday(){
		
		if(age<120){
			int increment = 1;
			return this.age + increment;
		}
		return -1;
		
	}

	public String getName() {

		return name;
	}
}
