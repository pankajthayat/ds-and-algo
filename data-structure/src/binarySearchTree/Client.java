package binarySearchTree;

public class Client {
public static void main(String[] args) {
	
	BinarySearchTree tree = new BinarySearchTree();
	tree.insert(50); 
	tree.insert(90);
	tree.insert(1);
	tree.insert(96);
	tree.insert(5); 
	tree.insert(70); 
	tree.insert(35); 
	tree.insert(23);
	tree.insert(110);
	
	tree.preOrderDisplay();
}
}
