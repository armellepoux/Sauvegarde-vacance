package com.sopra.pox3.equals;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class EqualsApplication {
	
	public static void main(String[] args) {
		
		Card c1= new Card(8,'h');
		Card c2= new Card(8,'s');
		Card c3= new Card(8,'h');
		
		boolean result = c1.equals(c2);
		System.out.println(result);
	
		result = c1.equals(c3);
		System.out.println(result);
	
		result = c2.equals(c3);
		System.out.println(result);
		
		//creer une liste et ajouter les cartes
		
		Set<Card> set = new HashSet<>(); //dans le set il ne doit y avoir que des elements uniques
		
		//2 methodes
		//set.add(c1);
		//set.add(c2);
		//set.add(c3);
		Collections.addAll(set, c1,c2,c3);
		System.out.println(set.toString());
		
	}

}
