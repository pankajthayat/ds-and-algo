package playground;

public class Main {
	public static void main(String[] args) {
		
		try {
			System.out.println("try block ");
			//System.exit(0);
			throw new NullPointerException();
		}catch(ArithmeticException e){
			System.out.println("catch block ");
		} 
		finally {
			System.out.println("finally");
		}
			
		System.out.println("rest of the code");
		}
	
	
	}




class Animal{

	public void add(Object x) {
		System.out.println("object called");
	}
	
	public void add(double[] d) {
		System.out.println("double called");
	}
	
	public void add(Integer i) {
		System.out.println("integer called");
	}
}
