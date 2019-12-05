package linkedList;

public class LinkedList {

	private Node head;
	
	public void stackByList(int data) {
		if(head==null) {
			head= new Node(data);
		} else {
			Node node = new Node(data);
			node.next = head;
			head = node;
		}
	}
	
	
	public void displayList() {
		
		Node current = head;
		while(current!=null) {
			System.out.print(current.data+ ", ");
			current =current.next;
		}
	}
}
