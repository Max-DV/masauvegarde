package com.sopra.pox3.structure;

import java.util.ArrayList;
import java.util.List;

public class Tree {

	Node root;

}

class Node {

	List<Branch> branches = new ArrayList<>();
	String value; 
}

abstract class Branch { // abstract interdit le fait de créer pour de vrai mais permet de dire que dans la liste ya des branches
	Node start;
}

class BranchWithNode extends Branch {
	Node end;
}

class BranchWithLeaf extends Branch {
	Leaf end;
}

class Leaf {
	String value;
}