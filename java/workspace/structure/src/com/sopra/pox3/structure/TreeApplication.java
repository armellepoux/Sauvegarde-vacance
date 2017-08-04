package com.sopra.pox3.structure;

public class TreeApplication {

	public static void main(String[] args){
		Tree dom= new Tree();//dom = Document Object Model
		dom.root=new Node();
		dom.root.value="html";
		
		BranchWithLeaf head=new BranchWithLeaf();
		head.end=new Leaf();
		head.end.value="head";
		
		BranchWithNode body=new BranchWithNode();
		body.end=new Node();
		body.end.value="body";
		
		dom.root.branches.add(head);
		dom.root.branches.add(body);		
	}
}
