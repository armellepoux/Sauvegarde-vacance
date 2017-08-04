package com.sopra.pox3.madagascar;

public class Emperor extends Penguin {

	public Emperor(String name) {
		super(name,28);
	}

	@Override
	public void slide() {
		System.out.println("Yeaaaaaaah !");
	}
	
	
	public void slide(Penguin p) {
		System.out.println("Yeaaaaaaah !" + p);
	}
	
	public void slide(Emperor p) {
		System.out.println("Pas cool..." + p);
	}
	
}
