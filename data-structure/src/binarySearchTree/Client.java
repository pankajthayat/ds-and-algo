package binarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class Client {
public static void main(String[] args) {
	
	BinarySearchTree tree = new BinarySearchTree();
//	
//	List<Node> list = new ArrayList<Node>();
//	Node n1 = new Node(10);
//	Node n2 = new Node(2);
//	list.add(n1); list.add(n2);
//	
//	System.out.println(list.contains(n1));

	tree.insert(50); 
	tree.insert(90);
	tree.insert(1);
	tree.insert(96);
	tree.insert(5); 
	tree.insert(70); 
	tree.insert(35); 
	tree.insert(23);
	tree.insert(110);
	
	tree.inorder(tree.root);
	System.out.println();
	tree.inorderItr(tree.root);
	
//	System.out.println(tree.postOrderIterative());
//	
//	
//	BinarySearchTree tree2 = new BinarySearchTree();
//	tree2.insertAlternateMethod(50); 
//	tree2.insertAlternateMethod(90);
//	tree2.insertAlternateMethod(1);
//	tree2.insertAlternateMethod(96);
//	tree2.insertAlternateMethod(5); 
//	tree2.insertAlternateMethod(70); 
//	tree2.insertAlternateMethod(35); 
//	tree2.insertAlternateMethod(23);
//	tree2.insertAlternateMethod(110);
//	
//	tree.preOrderDisplay();
//	
//	tree2.preOrderDisplay();
//	
//	tree2.preoderIterative();
}
}
