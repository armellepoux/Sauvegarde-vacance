package com.sopra.pox3.encapsulation;

import java.util.List;

import com.sopra.pox3.object.People;

public class King {

	String name;

	public King(String name) {
		this.name = name;
	}

	public void commandAll(List<People> allPeople){
		allPeople.stream().forEach(this::command);
	}
	
	protected void command(People p) { //protected permet que l'empereur par ex qui n'est pas dans le meme package d'y acceder
		System.out.println("Hey you " + p.getName() + " : work !");
	}

}
