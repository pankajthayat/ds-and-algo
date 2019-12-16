package avltree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeAVL {
public Node root;


public Node insert(Node root, int data) {
	if(root == null) {
		root = new Node(data);
	} else {
		if(root.data>data)
			root.setLeft(insert(root.left, data));
		else
			root.setRight(insert(root.right, data));
		int balance = balanceFactor(root);
		if(balance>1)
		{
			if(balanceFactor(root.left)<0)
				rotateLR(root);
			else
				rotateLL(root);
		} else if(balance<-1) {
			if(balanceFactor(root.right)>0)
				rotateRR(root);
			else
				rotateRR(root);
		}
	}
	return null;
}

int balanceFactor(Node node) {
	return height(node.left)-height(node.right);
}

public Node rotateLL(Node node) {
	Node temp = node;
	node.left =  temp.right;
	temp.right = node;
	node.height = Math.max(height(node.left), height(node.right))+1;
	temp.height = Math.max(height(temp.left), height(temp.right))+1;
	return temp;
}

public Node rotateRR(Node node) {
	Node temp = node;
	node.right=temp.left;
	temp.left = node;
	node.height = Math.max(height(node.left), height(node.right))+1;
	temp.height = Math.max(height(temp.left), height(temp.right))+1;
	return temp;
}

public Node rotateLR(Node node) {
	Node temp = rotateRR(node.left);
	return rotateLL(node);
	
//	node.height = Math.max(height(node.left), height(node.right))+1;
//	temp.height = Math.max(height(temp.left), height(temp.right))+1;
//	return temp;
}

public Node rotateRL  (Node node) {
	 rotateLL(node.left);
	return rotateRR(node);
	
//	node.height = Math.max(height(node.left), height(node.right))+1;
//	temp.height = Math.max(height(temp.left), height(temp.right))+1;
//	return temp;
}

public int height(Node node) {
	return node == null? 0 : node.height;
}

public void display() {
	Node c = root;
	Queue<Node> q = new LinkedList<Node>();
	q.offer(c);
	
	while(q.peek()!=null) {
		Node temp = q.poll();
		System.out.println(temp.data+", ");
		if(temp.left!=null)
			q.offer(temp.left);
		if(temp.right!=null)
			q.offer(temp.right);
	}
}



public void print(Node root) {

    if(root == null) {
        System.out.println("(XXXXXX)");
        return;
    }

    int height = root.height,
        width = (int)Math.pow(2, height-1);

    // Preparing variables for loop.
    List<Node> current = new ArrayList<Node>(1),
        next = new ArrayList<Node>(2);
    current.add(root);

    final int maxHalfLength = 4;
    int elements = 1;

    StringBuilder sb = new StringBuilder(maxHalfLength*width);
    for(int i = 0; i < maxHalfLength*width; i++)
        sb.append(' ');
    String textBuffer;

    // Iterating through height levels.
    for(int i = 0; i < height; i++) {

        sb.setLength(maxHalfLength * ((int)Math.pow(2, height-1-i) - 1));

        // Creating spacer space indicator.
        textBuffer = sb.toString();

        // Print tree node elements
        for(Node n : current) {

            System.out.print(textBuffer);

            if(n == null) {

                System.out.print("        ");
                next.add(null);
                next.add(null);

            } else {

                System.out.printf("(%6d)", n.data);
                next.add(n.left);
                next.add(n.right);

            }

            System.out.print(textBuffer);

        }

        System.out.println();
        // Print tree node extensions for next level.
        if(i < height - 1) {

            for(Node n : current) {

                System.out.print(textBuffer);

                if(n == null)
                    System.out.print("        ");
                else
                    System.out.printf("%s      %s",
                            n.left == null ? " " : "/", n.right == null ? " " : "\\");

                System.out.print(textBuffer);

            }

            System.out.println();

        }

        // Renewing indicators for next run.
        elements *= 2;
        current = next;
        next = new ArrayList<Node>(elements);

    }

}



}
