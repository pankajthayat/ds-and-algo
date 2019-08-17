package doublyLinkedList;

public class Node {

	private int data;
	private Node pre;
	private Node next;
	public Node() {
		// TODO Auto-generated constructor stub
	}
	
	public Node(int data) {
		this.data = data;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getPre() {
		return pre;
	}
	public void setPre(Node pre) {
		this.pre = pre;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	
}
