package binarySearchTree;

public class Node {
private int data;
private Node left;
private Node right;


public Node(int data) {
	this.data =data;
}

public int getData() {
	return data;
}
public Node setData(int data) {
	this.data = data;
	return this;
}
public Node getLeft() {
	return left;
}
public Node setLeft(Node left) {
	this.left = left;
	return this;
}
public Node getRight() {
	return right;
}
public Node setRight(Node right) {
	this.right = right;
	return this;
}



}
