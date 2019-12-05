package binarytree;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
	
		BinaryTree binaryTree = new BinaryTree();
		
		binaryTree.insertAsBst(50);
		binaryTree.insertAsBst(30);
		binaryTree.insertAsBst(40);
		binaryTree.insertAsBst(20);
		binaryTree.insertAsBst(90);
		binaryTree.insertAsBst(70);
		binaryTree.insertAsBst(75);
		binaryTree.insertAsBst(10);
		binaryTree.insertAsBst(25);
		binaryTree.insertAsBst(45);
		binaryTree.insertAsBst(65);
//		binaryTree.preOrder();
		
		Node root = binaryTree.root;
	binaryTree.topView(root);
		
//		System.out.println("max no : "+binaryTree.findMax());
		binaryTree.inorder();
//		binaryTree.inorderItrative();
		
	}

}
