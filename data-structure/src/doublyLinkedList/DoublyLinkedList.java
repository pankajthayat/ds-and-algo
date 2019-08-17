package doublyLinkedList;

public class DoublyLinkedList {

	private Node head;
	
	private int length;
	
	public void insertAtStart(int data) {
		Node node = new Node(data);
		node.setNext(head);
		if(head!=null) 
			head.setPre(node);
		head = node;
		length++;
	}
	
	public void insertAtEnd(int data) {
		Node node = new Node(data);
		if(head == null)
			head = node;
		else {
			Node current = head; 
			while(current.getNext() !=null)
				current =current.getNext();
			node.setPre(current);
			current.setNext(node);
		}
		length++;
	}
	
	public void insertAtPos(int data, int pos) {
		if(pos == 0)
			insertAtStart(data);
		else if( pos<0 || pos>length)
			throw new RuntimeException("position is in negative or above the length");
		else {
			Node node = new Node(data);
			Node current = head;
			int flag = 1;
			while(current != null) {
				if(pos == flag )
					break;
				flag++;
				current =current.getNext();
			}
			node.setNext(current.getNext());
			if(current.getNext()!=null)
				current.getNext().setPre(node);
			node.setPre(current);
			current.setNext(node);
		}
		length++;
	}
	
	
	public Node deleteAtStart() {
		if(head == null)
			return null;
		length--;
		Node returnValue =head;
		head = head.getNext();
		if(head!=null)
			head.setPre(null);
		return returnValue;
	}
	
	public Node deleteAtEnd() {
		if(head == null)
			return null;
		length--;
		Node current = head, pre = head;
		while(current.getNext()!=null) {
			pre = current;
			current = current.getNext();
		}
		
		if(current == pre) {
			head = null;
		}else {
			pre.setNext(null);
			//current.setPre(null); // no need
		}
		return current;
	}
	
	
	public Node deleteAtPos(int pos) {
		if(head == null)
		   return null;
		if( pos == 0)
			return deleteAtStart();
		
		Node current = head;
		int flag  = 0;
		while(current !=null) {
			if(flag == pos)
				break;
			current =current.getNext();
			flag++;
		}
		 if(current == null)
			 throw new RuntimeException("No element At this position : "+pos+" is greater then length "+length);
		 
//		 if(current.getNext() ==null) // if we include this line => no need the check the if condition below
//			deleteAtEnd();
		 
		 current.getPre().setNext(current.getNext());
		 if(current.getNext() !=null)
			 current.getNext().setPre(current.getPre());
		 
		 length--;
		 return current;
		
	}
	
	
	
	
 	public void display() {
		String str = "[ ";
		Node current;
		for(current = head; current!=null; current = current.getNext())
			str = str+current.getData()+", ";
		System.out.println(str+"]");
	}
	
	public int getLength() {
		return length;
	}
	
	
}
