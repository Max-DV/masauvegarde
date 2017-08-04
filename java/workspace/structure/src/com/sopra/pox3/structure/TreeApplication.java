package com.sopra.pox3.structure;

public class TreeApplication {

	public static void main(String[] args) {
		Tree dom = new Tree (); // document object model
		dom.root = new Node(); // dans mon dom, je lui donne une racine qui va etre un noeud
		dom.root.value= "html"; 
		
		BranchWithLeaf head = new BranchWithLeaf();
		head.end = new Leaf();
		head.end.value = "head";
		
		BranchWithNode body = new BranchWithNode();
		body.end = new Node();
		body.end.value = "body";
		
		dom.root.branches.add(head); // pour dire que les branches partent de la racine
		dom.root.branches.add(body);
	}

}
