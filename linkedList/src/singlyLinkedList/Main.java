package singlyLinkedList;

public class Main {
public static void main(String[] args) {
	SinglyLinkedList list = new SinglyLinkedList();
	
	list.insertAtEnd(1);
	list.insertAtEnd(2);
	list.insertAtEnd(3);
	list.insertAtEnd(7);
	list.display();
	System.out.println();
	
	
	list.insertAtEnd2(1);
	list.insertAtEnd2(2);
	list.insertAtEnd2(3);
	list.insertAtEnd2(7);
	list.display();
//	list.insert(99, 5);
//	list.display();
}
}