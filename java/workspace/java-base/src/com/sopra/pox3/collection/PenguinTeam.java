package com.sopra.pox3.collection;

import java.util.Iterator;
import java.util.List;

import com.sopra.pox3.madagascar.Penguin;

public class PenguinTeam {
	int count = 0;

	List<Penguin> penguins = new CircularList<>();
	Iterator<Penguin> iterator;

	public PenguinTeam(Penguin... allPenguins) {

		// for(int i = 0; i<allPengouins.length ; i++){
		// penguins.add(allPengouins[i]);
		// }

		for (Penguin p : allPenguins) {
			this.penguins.add(p);
		}
		iterator = this.penguins.iterator();
	}
	// varargs

	Penguin next() {

		return this.iterator.next();
	}

	public List<Penguin> getPenguins() {
		return penguins;
	}

}
