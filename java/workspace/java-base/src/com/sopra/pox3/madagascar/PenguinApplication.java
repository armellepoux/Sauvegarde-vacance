package com.sopra.pox3.madagascar;

public class PenguinApplication {

 public static void main(String[] args) {

	 
	/** List<Penguin> penguins = new ArrayList<>();
		
		Penguin skipper = new Penguin("Skipper", 15);
		Penguin kowalski = new Penguin("Kowalski", 8);
		Penguin rico = new Penguin("Rico", 21);
		Penguin ptitgars = new Penguin("P'tit gars", 6);
		
		penguins.add (skipper);
		penguins.add (kowalski);
		penguins.add (rico);
		penguins.add (ptitgars);
		
		System.out.println(penguins);
		
		Collections.sort(penguins);
		
		System.out.println(penguins);
		
		Collections.sort(penguins, new Comparator<Penguin>() {

			@Override
			public int compare(Penguin p1, Penguin p2) {
				return p1.speed.compareTo(p2.speed);
			}
		});
		System.out.println(penguins);
	 
}**/
	 
	 Penguin p1 = new Penguin("Tux",32);
	 Penguin p2 = new Penguin("Tux2");
	 Penguin p3 = new Penguin("Tux3",12);
	 
	 //Penguin p4 = new Penguin("",20);
	 
	 System.out.println("My penguin has empty name");
	 
	// Penguin p5 = new Penguin("");
	//System.out.println(p5);
	
	Emperor napoleon = new Emperor("Napoleon");
	System.out.println(napoleon);
	
	napoleon.slide();
	napoleon.slide(p1);
	
	Emperor Charlemagne = new Emperor("Charlemagne");
	
	Charlemagne.slide(napoleon);
	
	//jusqu'ici tout va bien ! Pure logique.
	System.out.println("==== Complex stuff ====");
	
	Penguin p = napoleon;
	p = p1;
	p = napoleon;
	p.slide();
	
	p=Charlemagne;
	napoleon.slide(p);
	
 }
}
