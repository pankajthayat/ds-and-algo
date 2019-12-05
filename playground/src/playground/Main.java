package playground;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Main {
	public static void main(String[] args) {
	
		Map<Animal, Integer> map = new HashMap<Animal, Integer>();
		Animal a1 = new Animal(1);
		Animal a2 = new Animal(2);
		Animal a3 = new Animal(3);
		Animal a4 = new Animal(4);
		Animal a5 = new Animal(5);
		Animal a6 = new Animal(6);
		
		Animal b =a1;
		
		
		map.put(a1, null);
		
		System.out.println(map.get(a2));
//		map.put(a2, 2);
//		map.put(a3, 3);
//		map.put(a4, 4);
//		map.put(a5, 5);
//		map.put(a6, 6);
//		map.put(b, 9);
		left(map);
		right(map);
		map.forEach((k, v)->System.out.println(" k "+k+"  v : "+v));
		
		
	
	}
	public static Map<Animal, Integer> left(Map<Animal, Integer> map) {
		Animal a1 = new Animal(1);
		map.put(a1, 222);
		return map;
	}
	
	public static Map<Animal, Integer> right(Map<Animal, Integer> map) {
		Animal a1 = new Animal(1);
		map.put(a1, 333);
		return map;
	}
}




class Animal{
		int leg;
		public Animal(Integer x) {
			// TODO Auto-generated constructor stub
			this.leg =x;
		}
}
