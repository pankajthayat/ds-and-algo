package binarySearchTree;

public class BinarySearchTree {

	private Node root;
	
	public void insert(int data) {
		if(root == null)
			root = new Node(data);
		else
			insertSuppliment(data, root);
	}
	
	private void insertSuppliment(int data, Node root) {
		if(root.getData()>=data) {
			if(root.getLeft() == null)
			    root.setLeft(new Node(data));
			else
				insertSuppliment(data, root.getLeft());
		}else {
			if(root.getRight()==null)
				root.setRight(new Node(data));
			else
				insertSuppliment(data, root.getRight());
		}
			
	}
	
	public void preOrderDisplay() {
		System.out.print("[ ");
		preorder(root);
		System.out.println("]");
		
	}
	
	private void preorder(Node root) {
		if(root!=null) {
			System.out.print(root.getData()+", ");
			preorder(root.getLeft());
			preorder(root.getRight());
		}
	}
}
