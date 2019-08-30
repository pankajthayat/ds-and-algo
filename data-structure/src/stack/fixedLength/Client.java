package stack.fixedLength;

public class Client {
public static void main(String[] args) {
	
	Stack stack =  new Stack();
	stack.push(1); stack.push(2); stack.push(3); stack.push(4);
	
	System.out.println(stack.size());
	System.out.println(stack);
	stack.pop();
	stack.pop();
//	stack.pop();
	System.out.println(stack.top());
	//stack.pop();
	//System.out.println(stack);
}
}
