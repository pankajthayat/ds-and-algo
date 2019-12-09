package bst;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Client {
public static void main(String[] args) {
	
	BinarySearchTree bst = new BinarySearchTree();
	bst.insert(50);
	bst.insert(30);
	bst.insert(80);
	bst.insert(20);
	bst.insert(40);
	bst.insert(70);
	bst.insert(75);
	bst.insert(78);
	bst.insert(90);
	int n = bst.findDiameter(bst.root);
	System.out.println("dia : "+n);
	System.out.println("h : "+bst.findHeight(bst.root, 0));
	System.out.println("d : --- : "+bst.diameter);

}

public static void demo(int x) {
	System.out.println(" x : "+x);
}
}
