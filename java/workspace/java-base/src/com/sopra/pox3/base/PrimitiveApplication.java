package com.sopra.pox3.base;

import java.math.BigDecimal;

public class PrimitiveApplication {

	public static void main(String[] args) {

		byte x = 10;
		int y = 234637;
		long z = 100_000_000_000L; // "L" pour annoncer qu'on utilise un "long"
									// car l'ordinateur lit de droite à gauche

		float f = 12;
		f = 2.34f;// ici il faut mettre un "f" car par defaut est un "double"

		double d = 12.54845468786432205456856435212354654842123465464346887;
		System.out.println(d);

		BigDecimal bigDecimal = new BigDecimal("-12.54845468786432205456856435212354654842123465464346887");

		char c = 'x';

		boolean vrai = false;

		boolean test = !(3 > 2 && (c != 'x') || (2 > 3));
		System.out.println(test);

		y = 8;
		int move = y >> 1;//shift
		System.out.println(move);
		move = y << 2;//unshift
		System.out.println(move);
		
	
	}

}
