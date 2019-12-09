package bst;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class BinarySearchTree {

	public Node root;
	public static int diameter;
	
	
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

	public int findDiameter(Node root) {
		
		Stack<Node> s = new Stack();
		s.push(root);
		int sum=0;
		while(!s.isEmpty()) {
			Node n = s.pop();
			if(n.right!=null)
				s.push(n.right);
			if(n.left!=null)
				s.push(n.left);
			
			int h1 = findHeight(root.left, 0);
			int h2 = findHeight(root.right, 0);
			if(sum<h1+h2+1)
				sum = h1+h2+1;
			
		}
		return sum;
	}
	
	int findHeight(Node root, int h) {
		if(root == null)
			return h;
		else {
			int h1 = findHeight(root.left, h+1);
			int h2 = findHeight(root.right, h+1);
			if((h1+h2)-1>diameter) {
				System.out.println("h1: "+h1+"   h2 : "+h2);
				diameter = (h1+h2)-1;
			}
				
			return h1 > h2 ? h1 : h2;
		}
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
	
	public void reverseLevelOrder(Node root) {
		
		Queue<Node> q= new LinkedList<Node>();
		q.add(root);
		List<Integer> list = new ArrayList();
		while(q.peek()!=null) {
			Node node = q.poll();
			list.add(node.data);
			if(node.right!=null)
			{
				q.add(node.right);
			}
				
			if(node.left!=null) {
				q.add(node.left);
			}
				
		}
//		System.out.println("list : "+list);
		for(int i =list.size()-1;i>=0;i--)
			System.out.print(list.get(i)+", ");
	}

}
