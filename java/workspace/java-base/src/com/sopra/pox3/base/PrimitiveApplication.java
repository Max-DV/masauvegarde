package com.sopra.pox3.base;

import java.math.BigDecimal;

public class PrimitiveApplication {

	public static void main (String[] args){
		
		byte x = 10;
		int y=234634;
		long z = 100_456_378_000L; // L pour preciser que c'est un long sinon il considere le nombre comme un int de base
		int testIt = (int) z;
		System.out.println(z);
		System.out.println(testIt);
		long a = 100;
		int b=(int) a;
		
		float f= 12;
		f=2.34f;
		
		BigDecimal bigDecimal= new BigDecimal("-12.9484984464538784545464"); //:  utilisation de valeur ayant des big decimal
		
		char c= 'x';
		boolean vrai= false;
		boolean test = ! (3> 2 & (c!='x') || 2>3);
		System.out.println(test);
		
		y=8;
		int move = y>> 1;
		System.out.println(move);
		move = y <<2;
		System.out.println(move);
		
		
		
	}
}
