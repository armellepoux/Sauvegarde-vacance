package com.sopra.pox3.structure;

import java.util.ArrayList;
import java.util.List;

public class Tree {
	
	Node root;
	

}

class Node{
	List<Branch> branches=new ArrayList<>();
	String value;
}

abstract class Branch{
	// Permet de dire qu'on va avoir des branches, mais une vue de l'esprit.
	//Empeche de creer des branches
	Node start;
}

class BranchWithNode extends Branch{
	Node end;
}

class BranchWithLeaf extends Branch{
	Leaf end;
}

class Leaf{
	String value;
}