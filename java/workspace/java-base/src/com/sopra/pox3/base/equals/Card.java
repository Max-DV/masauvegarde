package com.sopra.pox3.base.equals;

public class Card {

	int value;
	char color;

	public Card(int value, char color) {
		this.value = value;
		this.color = color;
	}
	
	
//
//	@Override
//	public int hashCode() {
//		return this.value + this.color;
//	}

//	@Override
//	public boolean equals(Object obj) {
//		if (obj instanceof Card) {
//
//			Card other = (Card) obj;
//			if (this.value == other.value && this.color == other.color) {
//				return true;
//			} else {
//				return false;
//			}
//
//		}
//		return false;
//	}

	@Override
	public int hashCode() { // generer le hashcode et equals pour un set de joueur ou autre!!!!!
		final int prime = 31;
		int result = 1;
		result = prime * result + color;
		result = prime * result + value;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Card))
			return false;
		Card other = (Card) obj;
		if (color != other.color)
			return false;
		if (value != other.value)
			return false;
		return true;
	}


	@Override
	public String toString() {
		// preffered
		return String.valueOf(this.value) + this.color;
		// return ""+ this.value() + this.color();
	}

	// si deux objet ont le meme hash ont va verifier dans equals qu'ils ont le meme nombre
	

}
