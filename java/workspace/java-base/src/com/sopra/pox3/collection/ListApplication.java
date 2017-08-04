package com.sopra.pox3.collection;

import java.util.List;

import com.sopra.pox3.madagascar.Penguin;

public class ListApplication {

	public static void main(String[] args) {
		
		new ListApplication().init();
	}
	
	void init(){
		
		Penguin rico = new Penguin("Rico");
		Penguin skipper = new Penguin("Skipper");
		Penguin privat = new Penguin("Private");
		Penguin kowalsky = new Penguin("Kowalsky");
		Penguin tux = new Penguin("Tux",98);
		
	
		PenguinTeam team = new PenguinTeam(rico, skipper, privat, kowalsky, tux);
		
		//System.out.println(team.penguins);
		
		System.out.println(team.next());
		System.out.println(team.next());
		System.out.println(team.next());
		System.out.println(team.next());
		System.out.println(team.next());
		System.out.println(team.next());
		System.out.println(team.next());
		System.out.println(team.next());
		System.out.println(team.next());
		System.out.println(team.next());
		System.out.println(team.next());
		System.out.println(team.next());
		
		List<Penguin> penguins=team.getPenguins();
		//qSystem.out.println(penguins);
		
	}
}
