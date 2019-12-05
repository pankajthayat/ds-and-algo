package singlyLinkedList;

public class Main {
public static void main(String[] args) {
	int x=4;
	SinglyLinkedList list = new SinglyLinkedList();
	SinglyLinkedList list2 = new SinglyLinkedList();
	
	list.insertAtEnd(1);
	list.insertAtEnd(2);
	list.insertAtEnd(5);
	list.insertAtEnd(6);
	list.insertAtEnd(8);
	
//	System.out.println("l :  "+list);
	
	justChecking(list.head);
	
	list.display();
	
}

public static void justChecking(Node head ) {
	if(head!=null) {
		justChecking(head.next);
		if(head.value == 5) {
			Node t = new Node(55555555);
			t.next = head.next;
			head.next =t;
		}
	}
}
}
