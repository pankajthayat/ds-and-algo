package bst;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
	
	
	List<Integer> l = bst.inorderList(bst.root);
	
	System.out.println("list : "+ l);
	
	List<Integer> demo = new ArrayList<Integer>();
	List<Integer> demo2 = new ArrayList<Integer>();
	
	demo.add(1);
	demo.add(20);
	demo.add(3);
	demo.add(44);
	demo.add(15);
	demo2.addAll(demo);
	System.out.println("demo2 : "+demo2);
//	demo.sort((x,y)->x.compareTo(y));
	Collections.sort(demo2);
	System.out.println("demo  : "+demo);
	System.out.println("demo2 : "+demo2);
	System.out.println();

	
//    boolean checkBST(Node root) {
//        boolean isBst =true;
//        Node c = root;
//        Stack<Node> s = new Stack();
//        s.add(c);
//        List<Integer> list = new ArrayList();
//        List<Integer> list2 = new ArrayList();
//        while(!s.isEmpty()){
//            if(c.left!=null){
//                c=c.left;
//                s.add(c);
//            } else{
//                c = s.pop();
//                list.add(c.data);
//                c = c.right;
//                if(c!=null)
//                    s.add(c);
//            }
//        }
//        
//        list2.addAll(list);
//        list.sort((x,y)->x.compareTo(y));
//        
//        for(int i=0;i<list.size();i++){
//            if(list.get(i) == list2.get(i))
//                isBst = false;
//        }
//        return isBst;
//    }
	

}
}
