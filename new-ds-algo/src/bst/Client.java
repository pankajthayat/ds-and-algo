package bst;

public class Client {
public static void main(String[] args) {
	
	BinarySearchTree bst = new BinarySearchTree();
	bst.insert(10);
	bst.insert(30);
	bst.insert(40);
	bst.insert(6);
	bst.insert(3);
	bst.insert(1);
	
	
	bst.inorder(bst.root);
	System.out.println();
	
	Node p = bst.findMinimum(bst.root);
	
	System.out.println(p.data);
	

}
}
