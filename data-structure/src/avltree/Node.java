package avltree;

public class Node {

	public Node right;
	public Node left;
	public int data;
	public int height;
	
	public Node() {
		// TODO Auto-generated constructor stub
	}
	
	public Node(int data) {
		this.data = data;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public int getData() {
		return data;
	}

	public void setData(int value) {
		this.data = value;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	

	
	
}
