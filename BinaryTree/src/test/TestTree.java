package test;

import tree.BinaryTree;

public class TestTree {
	
	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		
		tree.insertNode(15);
		tree.insertNode(22);
		tree.insertNode(17);
		tree.insertNode(10);
		tree.insertNode(20);
		tree.insertNode(16);
		
		tree.inOrder(tree.getRoot());
		
	}
	
}
