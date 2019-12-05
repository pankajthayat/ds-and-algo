package binarytree;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;


public class BinaryTree {

	 Node root;
	
	
	
	
		public void topView(Node root) {
		      Node c =root;
		      int left=0, right =0;
		      Map<Node, Integer> map = new HashMap<Node, Integer>();
		      map.put(root, 0);
		      map = help(root, map);

		      map.forEach((k, v)->{
		          System.out.println(k.data +"   "+v);
		      });
		      while(c!=null){
		          System.out.print(c.data+" ");
		          left = map.get(c);
		          c=c.left;
		          
		      }
		        c = root;
		      while(c.right!=null){
		          System.out.print(c.right.data+" ");
		          right = map.get(c.right);
		          c=c.right;
		          
		      }
		      final int r =right, l =left;
		      System.out.println("r : "+r+" l : "+l);
		      map.forEach((k, v)->{
		          if(v>r)
		            System.out.print(k.data+" ");
		             if(v<l)
		            System.out.print(k.data+" ");
		      });
		      System.out.println();
		    }

		     public  Map<Node, Integer> help(Node root, Map<Node, Integer> map){
		            if(root!=null){
		                Map<Node, Integer> leftMap = left(root, map);   
		                Map<Node, Integer> rightMap = right(root, map);   
		                help(root.left, leftMap);
		                help(root.right, rightMap);
		                return map;
		            } else{
		                return map;
		            }
		        }
	
	
	
	

	 
		public Map<Node, Integer> left(Node node, Map<Node, Integer> map) {
//			System.out.println("node : "+node.data +"   "+  map.get(node));
			if(node.left!=null)
				map.put(node.left, map.get(node)-1);
			return map;
		}
	
		public Map<Node, Integer> right(Node node, Map<Node, Integer> map) {
//			System.out.println("node rigt : "+node.data +"   "+  map.get(node));
			if(node.right!=null)
				map.put(node.right, map.get(node)+1);
			return map;
		}
	
	public int findMax() {
		if(root==null)
			throw new RuntimeException("Tree is Empty");
		return findMax(root, Integer.MIN_VALUE);
	}
	
	
	
	private int findMax(Node root, int max) {
		if(root!=null)
		{
//			System.out.println("--------hey: "+root.data+ "   max : "+max);
			if(max<root.data)
				max=root.data;
			findMax(root.left, max);
			findMax(root.right, max);
		}
//		System.out.println("hello : "+max);
		return max;
		
	}
	
	
	
	
	
	
	
	
	
	public void inorderItrative() {
		if(root == null)
			System.out.println("tree is empty");
		else {
			Stack<Node> s= new Stack();
			Node current = root;
			s.push(root);
			while(!s.isEmpty()) {
				if(current!=null) {
					if(current.left!=null)
						s.push(current.left);
					current= current.left;
				} else {
					current =s.pop();
					System.out.print(current.data+", ");
					if(current.right!=null)
						s.push(current.right);
					current = current.right   ;
				}
			}
			System.out.println();
		}
		
	}
	
	public void preOrder() {
		if(root ==null)
			System.out.println(" tree is empty ");
		else
			preorder(root);
		System.out.println();
	}
	
	public void preorder(Node root) {
		if(root!=null) {
			System.out.print(root.data+", ");
			preorder(root.left);
			preorder(root.right);
		}
	}
	public void inorder() {
		if(root==null)
			System.out.println("Tree is empty");
		else
			inorder(root);
		System.out.println();
	}
	
	public void inorder(Node root) {
		if(root!=null) {
			inorder(root.left);
			System.out.print(root.data+", ");
			inorder(root.right);
		}
	}
	public void postorder() {
		if(root==null)
			System.out.println("Tree is empty");
		else
			postorder(root);
	}
	
    public void postorder(Node root) {
		
	}


	public void  insertAsBst(int data) {
		if(root==null)
			root = new Node(data);
		else
			insertHelper(root, data);
	}
	
	public void insertHelper(Node root, int data) {
		if(root.data>data) {
			if(root.left==null) root.left = new Node(data);
			else insertHelper(root.left, data);
		} else {
			if(root.right == null) root.right = new Node(data);
			else insertHelper(root.right, data);
		}
	}
	
}
