package main;

import genericDemo.Box;
import genericDemo.Pair;

public class GenericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box<String> box = new Box<String>();
		
		box.set("First box");
		System.out.println(box.get());
		
//		box.printArray(new Integer[] {10,20});
		
		box.printArray(new String[] {"Hello", "Abhishek"});
		
		Box<Integer> box2 = new Box<Integer>();
		box2.printArray(new Integer[] {10,20,30});
		
		box2.printSquare(10);
		
		
		//INTERMEDIATE LEVEL
		
		Pair<String, Integer> pair1 = new Pair<String, Integer>("Hello", 1);
		System.out.println(pair1.getKey()+" "+ pair1.getValue());
		
		Pair.printPairArray(new Pair[] {new Pair<String, Integer>("Hello array", 1)});
		

	}

}
