package avltree;

public class AVLClient {

	public static void main(String[] args) {
		
		TreeAVL tree = new TreeAVL();
		tree.insert(tree.root, 1);
		tree.insert(tree.root, 2);
		tree.insert(tree.root, 3);
		tree.display();

	}

}
