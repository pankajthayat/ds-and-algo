package heap;

import java.util.Arrays;

public class HeapClient {

	public static void main(String[] args) {
	
		Heap h = new Heap(10);
		h.insert(50);
		h.insert(20);
		h.insert(30);
		h.insert(70);
		h.insert(0);
		
		System.out.println("heap : "+Arrays.toString(h.arr));
		
	}

}
