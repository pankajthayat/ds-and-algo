package singlyLinkedList;

public class SinglyLinkedList {
	private Node head;
	private int length;
	
	
	public SinglyLinkedList insertAtEnd(int value) {
		if(head==null) {
			head = new Node();
			head.setValue(value);
		}else {
			Node current = head;
			while(current.getNext() !=null) {
				current = current.getNext();
			}
			
			Node node = new Node();
			node.setValue(value);
			current.setNext(node);
		}
		length++;
		return this;
	}
	
	public void insertAtEnd2(int data) {
		
		if(head == null) 
			head.setValue(data);
		else {
			Node node = new Node(data);
			Node pre, nxt;
			for(pre=head; (nxt = pre.getNext())!=null; pre=nxt);
				pre.setNext(node);
		}

	}
	
	public void insertAtBeginning(int data) {
		Node node = new Node(data);
		node.setNext(head);
		head = node;
		length++;
	}
	
	public void insert(int data, int position) { 
		
		if(position == 0)
			insertAtBeginning(data);
		else if(position > length+2)
			throw new RuntimeException("cannot insert at position "+position);
		else {
			int positionFlag = 0;
			Node current = head;
			while(current!=null) {
				if(position == positionFlag+1)
					break;
				current = current.getNext();
				positionFlag++;
			}
			Node newNode = new Node(data);
			newNode.setNext(current.getNext());
			current.setNext(newNode);
			
		}
		length++;
			
	}
	
	
	public void deleteData(int data) {// it will delete the 1st matched data
		if(head == null) throw new RuntimeException("list is empty");
		
		Node preNode = null;
		Node currNode = head;
		
		while(currNode !=null) {
			if(currNode.getValue() == data)
				break;
			preNode = currNode;
			currNode = currNode.getNext();
		}
		
		if(currNode == null) throw new RuntimeException(data + " not found in list");
		if(preNode == null) { 
			head = currNode.getNext(); 
			}else {
				preNode.setNext(currNode.getNext());
			}
		
	}
	
	public void display() {
		Node current = head;
		while(current !=null) {
			System.out.print(current.getValue()+", ");
			current = current.getNext();
		}
		System.out.println();
	}
	
	
}