package heap;

public class Heap {

	int arr[];
	int capacity;
	int count;
	
	public Heap(int capacity) {
		this.capacity=capacity;
		this.count = 0;// already get set in class..neverthless
		this.arr=new int[capacity];
	}
	
	public void insert(int data) {
		arr[count] =data;
		percolateUp(count);
		count++;
	}
	
	public void percolateUp(int index) {
		int parent =  getParent(index);
		if(parent<0) return;
		 if(arr[parent] < arr[index]) {
			 int temp = arr[parent];
			 arr[parent] = arr[index];
			 arr[index] = temp;
			 percolateUp(parent);
		 }
	}
	
	
	public void percolateDown(int index) {
		if(index<0 || index >= count)
			return;
		int left = leftChild(index);
		int right = rightChild(index);
		int max = arr[index]<arr[left] ? left :index;
		max = arr[max] < arr[right] ? right:max;
		if(max!=index){
			int temp = arr[index];
			arr[index] =arr[max];
			arr[max] = temp;
			percolateDown(max);
		}
	}
	 
	public int leftChild(int index) {
		if(index<0 || index >= this.capacity)
			return -1;
		int left = 2*index + 1;
		return left > capacity-1 ? -1 :left;
	}
	
	public int rightChild(int index) {
		if(index < 0 || index >= this.capacity)
			return -1;
		int right = 2*index + 2;
		return right> capacity-1 ? -1 : right; 
	}
	public int getParent(int index) {
		if(index < 0 || index >= this.capacity)
			return -1;   
		int parent =  (index-1)/2;
		if(parent<0)
			return -1;
		return parent;
	}
}
