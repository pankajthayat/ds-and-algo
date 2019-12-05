package binarySearchTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class BinarySearchTree {

	 Node root;
	
	
	

void inorderItr(Node root) {
	Node c = root;
    Stack<Node> s= new Stack();
    do{
        if(c!=null){
            s.push(c);
            c=c.left;
        } else{
            c=s.pop();
            System.out.print(c.data+" ");
            if(c.right!=null){
                c=c.right;
                s.push(c);
            } 
                c=c.left;
            
        }
    } while(!s.isEmpty());
}


void inorder(Node root) {
	if(root!=null) {
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
	}
}

	public void postorder() {
		System.out.print("[ ");
		postorder2(root);
		System.out.println("]");
	}
	
	private void postorder2(Node root) {
		if(root!=null) {
			postorder2(root.getLeft());
			postorder2(root.getRight());
			System.out.print(root.getData()+", ");
		}
	}
	public void insert(int data) {
		if(root == null)
			root = new Node(data);
		else
			insertSuppliment(data, root);
	}
	
	
	public void insertAlternateMethod(int data) {
		if(root == null)
			root =  new Node(data);
		else
			root.insert(data);
	}
	
	
	private void insertSuppliment(int data, Node root) {
		if(root.getData()>data) {
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
	
	public void preoderIterativeDisplay() {
		System.out.println(preorderIterative2(root));
	}
	private List preorderIterative2(Node root) {
		List<Integer> list = new ArrayList<>();
	
		Stack<Node> stack = new Stack<Node>();
		if(root != null)
		   stack.push(root);
		while(!stack.isEmpty()) {
			
			Node node = stack.pop();
			list.add(node.getData());
			if(node.getRight()!=null)
				stack.push(node.getRight());
			if(node.getLeft()!=null)
				stack.push(node.getLeft());
			
		}
		return list;
		
	}
	
public List<Integer> postOrderIterative() {
	Stack<Node> stack = new Stack<Node>(); 
	stack.push(root);
	List<Integer> list = new ArrayList<Integer>();
	List<Node> list2 = new ArrayList<Node>();
	while(!stack.isEmpty()) {
		Node root =  stack.pop();
		if(!list2.contains(root)) {
//			System.out.println("pankaj : "+ root.getData());
		
			stack.push(root);
			if(root.getRight()!=null)
				stack.push(root.getRight());
			if(root.getLeft()!=null)
				stack.push(root).getLeft();
			list2.add(root);
//			System.out.println("hey : ");
		}
		else {
//			System.out.println("rahul");
			list.add(root.getData());
		}
	}
	return list;
}
	
//	public void inorderIterative() {
//		Queue<Node> queue = new LinkedList<Node>();
//		if(root !=null)
//			queue.add(root);
//		while(!queue.isEmpty()) {
//			Node node = queue.poll();
//			Node node = queue.offer(root.getLeft());
//			System.out.print();
//		}
//	}
}
