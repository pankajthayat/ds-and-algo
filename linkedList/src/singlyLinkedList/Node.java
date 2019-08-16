package singlyLinkedList;

public class Node {
	private int value;
	private Node next;
	public int getValue() {
		return value;
	}
	public Node() {
		
	}
	public Node(int data){
		this.value = data;
	}
	public Node setValue(int value) {
		this.value = value;
		return this;
	}
	public Node getNext() {
		return next;
	}
	public Node setNext(Node next) {
		this.next = next;
		return this;
	}
	
}
