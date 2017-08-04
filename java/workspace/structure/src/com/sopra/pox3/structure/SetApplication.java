package com.sopra.pox3.structure;

import java.util.TreeSet;

public class SetApplication {

	public static void main(String[] args) {

		//HashSet<String> names = new HashSet<>();
		//avec HashSet, tous les elements sont uniques
		
		TreeSet<String> names = new TreeSet<>();
		//treeSet : unique et trie
				names.add("Jo");
				names.add("Jack");
				names.add("John");
				names.add("Jim");
				names.add("Jo");
				names.add("Jack");
				names.add("John");
				names.add("Jim");
				names.add("Jo");
				names.add("Jack");
				names.add("John");
				names.add("Jim");	
				names.add("Jo");
				names.add("Jack");
				names.add("John");
				names.add("Jim");	
				names.add("Jo");
				names.add("Jack");
				names.add("John");
				names.add("Jim");
				names.add("Jo");
				names.add("Jack");
				names.add("John");
				names.add("Jim");
				names.add("Jo");
				names.add("Jack");
				names.add("John");
				names.add("Jim");
				
				System.out.println(names);

	}

}
