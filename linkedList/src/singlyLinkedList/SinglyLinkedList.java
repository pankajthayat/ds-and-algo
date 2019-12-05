package singlyLinkedList;

import java.util.ArrayList;
import java.util.List;

public class SinglyLinkedList {
	 Node head;
	 int length;

	    static int findMergeNode(Node head1, Node head2) {
	    	Node c = head1;
	    	List<Node> list = new ArrayList<Node>();
	    	list.add(head1);
	    	while(c!=null){
	    	    if(list.contains(head2))
	    	        break;
	    	    c=c.next;
	    	    head2 =  head2.next;
	    	}
	    	if(c!=null)
	    	    return c.value;
	    	    return 0;

	    	    }
	 
	 public int getNode(Node head, int pos) {
		 return getNode(head, pos, 0);
	 }
	 
	 private int getNode(Node head, int pos, int f) {
		 if(head!=null) {
			 f= getNode(head.next, pos, f);
			 return f == pos ? head.value : ++f;
		 }else {
			 return 0;
		 }
	 }
	
	public static SinglyLinkedList mergeTwoSortedNode(SinglyLinkedList list1, SinglyLinkedList list2) {
		Node c1 = list1.head;
		Node c2 = list2.head;
		SinglyLinkedList newList = new SinglyLinkedList();
		
		while(c1!=null || c2!=null) {
			System.out.println("hello");
			if(c1!=null && c2!=null) {
				if(c1.value>c2.value) {
					newList.insertAtEnd(c2.value);
					c2 = c2.next;
				}else {
					newList.insertAtEnd(c1.value);
					c1 = c1.next;
				}
					
			}
			if(c2 == null) {
				newList.insertAtEnd(c1.value);
				c1 = c1.next;
			} 
			if(c1 == null) {
				newList.insertAtEnd(c2.value);
				c2 = c2.next;
			}
		}
		return newList;
	}
	
	public void reverse() {
		int count = 0;
		for (Node c = head; c != null; c = c.getNext()) {
			count++;
		}
		int help = count;
		for (int i = 1; i < count; i++) {
			Node c = head;
			for (int j = 1; j < help; j++) {
				int data = c.getValue();
				c.setValue(c.getNext().getValue());
				c.getNext().setValue(data);
				c=c.getNext();
			}
			help--;
		}
	}

	public SinglyLinkedList insertAtEnd(int value) {
		if (head == null) {
			head = new Node();
			head.setValue(value);
		} else {
			Node current = head;
			while (current.getNext() != null) {
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

		if (head == null) {
			Node node = new Node(data);
			head = node;
		} else {
			Node node = new Node(data);
			Node pre, nxt;
			for (pre = head; (nxt = pre.getNext()) != null; pre = nxt)
				;
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

		if (position == 0)
			insertAtBeginning(data);
		else if (position > length + 2)
			throw new RuntimeException("cannot insert at position " + position);
		else {
			int positionFlag = 0;
			Node current = head;
			while (current != null) {
				if (position == positionFlag + 1)
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

	public Node deleteAtStart() {
		Node returnValue = head;
		if (head == null)
			return null;
		else {
			head = head.getNext();
		}
		return returnValue;
	}

	public Node deleteAtEnd() {
		if (head == null)
			return null;

		Node pre = head, current = head;

		while (current.getNext() != null) {
			pre = current;
			current = current.getNext();
		}
		if (pre == current) // when head.getNext() == null .... be careful of this situation when pre =cur
							// alway, everywhere..
			head = null;
		pre.setNext(null);// pre.setNext(current.getNext());
		return current;
	}

	public Node deleteAtPos(int position) {

		return null;
	}

	public void removeData(int data) {// it will remove the 1st matched data
		if (head == null)
			throw new RuntimeException("list is empty");

		Node preNode = null;
		Node currNode = head;

		while (currNode != null) {
			if (currNode.getValue() == data)
				break;
			preNode = currNode;
			currNode = currNode.getNext();
		}

		if (currNode == null)
			throw new RuntimeException(data + " not found in list");
		if (preNode == null) {
			head = currNode.getNext();
		} else {
			preNode.setNext(currNode.getNext());
		}

	}

	public void display() {
		Node current = head;
		while (current != null) {
			System.out.print(current.getValue() + ", ");
			current = current.getNext();
		}
		System.out.println();
	}

}
