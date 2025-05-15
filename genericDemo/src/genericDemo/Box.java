package genericDemo;

public class Box<T>{

	T t;
	
	public void set(T t){
		this.t = t;
	}

	public T get(){
		return t;
	}
	
	
	//Task 2
	//printArray(new Integer[]{1, 2, 3});
	
	public void printArray(T[] tarray) {
		
		for(T t: tarray) {
			
			System.out.println(t);
			
			
		}
		
	}
	
	
	//create a method only accepts number
	
	public <T extends Number>void printSquare(T t) {
		double square = t.doubleValue()*t.doubleValue();
		System.out.println("T squared:"+ square);
		
	}

}
