package stack.fixedLength;

public class Stack {
	
	public int capacity;
	
	public static final int DEFAULT_CAPACITY = 5;
	public int[] array;
	public Stack() {
		capacity = DEFAULT_CAPACITY;
		array = new int[DEFAULT_CAPACITY];
	}
	
	public Stack(int capacity) {
		this.capacity =capacity;
		array = new int[capacity];
	}
	
	private int top = -1;
	
	
	public int push(int data) {
		if(isFull())
			throw new RuntimeException("stack is full");
		array[++top] = data;
		return data;
	}

	public int size() {
		return top + 1;
	}
	public boolean isEmpty() {
		return top == -1;
	}
	public boolean isFull() {
		return top + 1 == capacity;
	}
	
	public int top() {
		if(isEmpty())
			throw new RuntimeException(" stack is empty");
		return array[top];
	}
	
	public int pop() {
		if(isEmpty())
			throw new RuntimeException(" stack is empty");
		int removedValue = array[top];
		array[top--] = Integer.MIN_VALUE;
		return removedValue;
			
	}
	
	@Override
	public String toString() {
		
		String stringRepresentation = "[ ";
		for(int i =0;i< size();i++) {
			stringRepresentation = stringRepresentation+array[i]+", ";
		}
		return stringRepresentation + "]";
	}

}
