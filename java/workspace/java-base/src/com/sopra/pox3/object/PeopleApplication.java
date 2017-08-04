package com.sopra.pox3.object;

import java.util.Arrays;

import com.sopra.pox3.encapsulation.Queen;

public class PeopleApplication {

	public static void main(String[] args) {

		People john = new People("John", 12);
		People jack = new People("Jack", 14);
		System.out.println(People.maxAge);
		//People.maxAge++;
		System.out.println(People.maxAge);

		final People ada = new People("Ada", 30);
		ada.name = "Lovelace";
		System.out.println(ada.name);
		//ada = jack;
		
		Queen liza = new Queen("Elizabeth");
		System.out.println(liza.getName());
		
		Emperor napoleon = new Emperor("Napoleon");
		napoleon.commandAll(Arrays.asList(john,jack));
		
	}

}
