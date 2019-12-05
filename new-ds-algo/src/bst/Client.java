package bst;

public class Client {
public static void main(String[] args) {
	
	BinarySearchTree bst = new BinarySearchTree();
	bst.insert(10);
	bst.insert(30);
	bst.insert(40);
	bst.insert(6);
	bst.insert(3);
	
	bst.inorder(bst.root);
	System.out.println();
	Node n = bst.find(bst.root, 30);
	
	System.out.println(n.data);
	
Node m = bst.find(bst.root, 39);
	
	System.out.println(m.data);
}
}
