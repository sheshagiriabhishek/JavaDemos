package main;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;
import java.util.stream.Collectors;


public class StreamDemo {
//	List<Integer> list = Arrays.asList(10,20,30, 33);
//	Stream<Integer> stream = list.stream();
//	
//	List<Integer> l = stream.
//			filter(n->n%2==1)
//			.collect(Collectors.toList());
//	
	
	List<Integer> list = Arrays.asList(10,20,30, 31, 33);
	
	List<Integer> result = list.stream()
	.filter(n->n%2==1)
	.collect(Collectors.toList());
	
	
	void method() {
		
		System.out.println(list);
	}
	
	void method1() {
		String str = "Abhishek";
		
		Map<Character, Long> map = str.chars()
		.mapToObj(c -> (char)c )
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	}
	
	
	
	
				
	
}
