package bst;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class BinarySearchTree {

	public Node root;
	
	
	List<Integer> inorderList(Node root) {
		Node c= root;
		List<Integer> list = new ArrayList();
//		Queue<Node> q= new LinkedList<Node>();
		Stack<Node> q = new Stack<Node>();
		q.add(c);
		while(!q.isEmpty()) {
			if(c!=null && c.left!=null ) {
				c=c.left;
				q.add(c);
			} else {
				c = q.pop();
				list.add(c.data);
				c = c.right;
				if(c!=null)
					q.add(c);
			}
		}
		
		return list;
		
	}
	
	public Node findMinimum(Node root){
	
		if(root.left==null)
			return root;
		else
			return findMinimum(root.left);
	}
	
	
	public Node find(Node root, int data) {
		if(root == null)
			return root;
		if(root.data == data)
			return root;
		if(root.data>data)
			return find(root.left, data);
		else
			return find(root.right, data);
	}
	
	
	public Node findItretive(int data) {
		Node c = root;
		while(c!=null) {
			if(c.data == data)
				break;
			if(c.data>data)
				c = c.left;
			else
				c = c.right;
		}
		return c;
	}
	
	
	public void insert(int data) {
		if(root==null) {
			root = new Node(data);
		} else {
			insertHelp(root, data);
		}
	}
	
	void insertHelp(Node root, int data) {
		if(root.data>data) {
			if(root.left==null)
				root.left =  new Node(data);
			else {
				insertHelp(root.left, data);;
			}
		} else {
			if(root.right==null)
				root.right = new Node(data);
			else
				insertHelp(root.right, data);
		}
	}
	
	public void inorder(Node root) {
		if(root!=null) {
			inorder(root.left);
			System.out.print(root.data + ", ");
			inorder(root.right);
		}
	}

}
