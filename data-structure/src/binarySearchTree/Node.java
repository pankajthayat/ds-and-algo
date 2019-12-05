package binarySearchTree;

public class Node {
 int data;
 Node left;
 Node right;


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


 void insert(int data) {
	 if(this.data>data) {
		 if(this.left==null)
			 this.left =  new Node(data);
		 else
			 this.left.insert(data);
	 }else {
		 if(right == null)
			 right =  new Node(data);
		 else
			 right.insert(data);
	 }
 }


}
