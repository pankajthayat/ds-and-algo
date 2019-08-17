package doublyLinkedList;

public class Client {

	public static void main(String[] args) {

		DoublyLinkedList list = new DoublyLinkedList();
		list.insertAtEnd(1);
		list.insertAtEnd(2);
		list.insertAtEnd(3);
		list.insertAtEnd(4);
		list.display();
		
		Node node = list.deleteAtPos(4);
		list.display();
		
		System.out.println("node : "+node.getData());
//		list.deleteAtEnd();
//		list.display();
//		Node x = list.deleteAtEnd();
//		
//		System.out.println("node : "+x.getData());
//		list.display();
		
		
	}

}
