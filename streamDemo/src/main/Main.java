package main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Main{
	public static void main(String[] args){
	
		// BASIC LEVEL
//		//Filter Even Numbers
//		
//		List<Integer> list1 = Arrays.asList(1,2,3,4);
//		Stream<Integer> stream = list1.stream();
//		
//		List<Integer> res1 = stream
//		.filter(n->n%2==0)
//		.collect(Collectors.toList());
//		
//		System.out.println("res1:"+res1);
//		
//		//Convert Strings to Uppercase
//		
//		List<String> list2 = Arrays.asList("Alice", "Bob", "Abhi");
//		Stream<String> stream2 = list2.stream();
//		List<String> res2 = 
//		stream2
//		.map(s->s.toUpperCase())
//		.collect(Collectors.toList());
//		
//		
//		
//		
//		System.out.println("res2:"+res2);
//		
//		
//		//Sort a List of Strings
//		
//		List<String> res3 = 
//		stream2
//		.sorted(new Comparator<String>() {
//			public int compare(String s1, String s2) {
//				return 0;
//				
//			}
//			
//		})
//		.collect(null);
//	
//		
//		System.out.println("res3:"+res3);
		
		//Sort a list of Strings
		
//		Arrays.asList("Alice", "Abhishek")
//		.stream()
//		.sorted()
//		.forEach(System.out::println);
//		
//		Arrays.asList("Amulya", "Abhishek", "Rama")
//		.stream()
//		.sorted(new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				// TODO Auto-generated method stub
//				return o1.length()>o2.length()?1:-1;
//			}
//
//			
//			
//			
//		})
//		.forEach(System.out::println);
		
		
		
//		List<String> list = Arrays.asList("Abhishek","Rama" ,"Bhavana");
//		List<String> result = list.stream()
//		.sorted()
//		.collect(Collectors.toList());
//		
//		System.out.println("Result:"+result);
//	
//		String str = "abc A";
		
//		List<String> names = Arrays.asList("alice", "charlie", "bob");
//		// Output: ["ALICE", "BOB", "CHARLIE"]
//		List<String> strList = names.stream()
//		.sorted(new Comparator<String>(){
//
//			@Override
//			public int compare(String s1, String s2) {
//				// TODO Auto-generated method stub
//				if(s1.length() == s2.length()) return 0;
//				return s1.length()>s2.length()?1:-1;
//				
//			}
//			 
//		})
//		.collect(Collectors.toList());
//		
//		for(String str: strList)
//			System.out.println(str);

		
		
		
		
		//INTERMEDIATE LEVEL
		
		//Get a list of distinct elements
//		List<Integer> list = Arrays.asList(1,2,3,3,4);
//		Set set = new HashSet<Integer>(); 
//		Stream<Integer> stream = list.stream();
//		
//		List<Integer> result  = stream.filter(n->!set.contains(n))
//		.map(n->{
//			set.add(n);
//			return n;})
//		.collect(Collectors.toList());
//		
//		System.out.println("Result:"+result);
//		set.clear();
//		
//		List<Integer> list2 = Arrays.asList(1,2,3,4,5,6,6);
//		Stream<Integer> stream2 = list2.stream();
//		List<Integer> result2 = stream2.
//		filter(n->!set.contains(n))
//		.map(
//			n->{set.add(n);
//			return n;}
//		)
//		.collect(Collectors.toList());
//		
//		System.out.println("Result:"+result2);
		
		
		//Get Distinct Elements
		
//		List<Integer> l4 = Arrays.asList(1,2,2,3,4,5,5,6);
//		Stream<Integer> s4 = l4.stream();
//		Set<Integer> hs = new HashSet<Integer>();
//		 List<Integer> r4 = s4
//		.filter(n-> !hs.contains(n))
//		.map(n->{
//			hs.add(n);
//			return n;
//			})
//		.collect(Collectors.toList());
//		 
//		 
//		 System.out.println(r4);
		
		
//		List<String> list = Arrays.asList("Abhishek", "Amulya", "Achuth");
//		
//		list.stream()
//		.filter(str->str.endsWith("k"))
//		.forEach(System.out::println);
		
//		Arrays.asList(1,2,3,4)
//		.stream()
//		.filter(n->n%2==0)
//		.forEach(System.out::println);
		
		Arrays.asList("abhi", "amul")
		.stream()
		.map(String::toUpperCase)
		.forEach(System.out::println);

		
		List<Integer> list = Arrays.asList(10,10,20)
		.stream()
		.distinct()
		.collect(Collectors.toList());
		
		System.out.println(list);
		
//		Optional<String> first = Arrays.asList("Abhishek", "Bhavya", "Amulya")
//		.stream()
//		.filter(s->s.startsWith("A"))
//		.findFirst();
//		
//		System.out.println(first.get());
		
		
		//First element to start woth A
		
//		System.out.println(
//		Arrays.asList("Amulya", "Bob","Avijith")
//		.stream()
//		.filter(s->s.startsWith("A"))
//		.findFirst()
//		.get());
//		
//		List<String> res = Arrays.asList("Abhi", "Amulya", "Usha")
//		.stream()
//		.filter(s->s.length()==4)
//		.collect(Collectors.toList());
//		
//		System.out.println(res);
//		
//		Map<String, List<Employee>> map = Arrays.asList(
//				new Employee("1","Abhi", "Software"),
//				new Employee("2","Amulya", "Hardware"),
//				new Employee("3","Abhilash", "Hardware"))
//		.stream()
//		.collect(
//				Collectors.groupingBy(Employee::getDept));
//		
//		map.forEach((k,v)->{
//			System.out.println(k.toUpperCase());
//			v.forEach(e->System.out.println(e.getName()));
//		});
//		
		List<Employee> employees = Arrays.asList(
				new Employee("1","Ahalya", "EC"), 
				new Employee("2","Moulya", "CS"),
				new Employee("3","Harini", "EC"));
		
		
		//First non repeated character
			String str = "bhaishek";
			
			Map<Character, Long> map = str.chars()
			.mapToObj(c -> (char)c )
			.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
			
			Optional<Object> character = map.entrySet().stream()
			.filter(entry->entry.getValue()==1)
			.findFirst()
			.map(entry->entry.getKey());
			
			
			Optional<Character> chr = str.chars()
			.mapToObj(c->(char)c)
			.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
			.entrySet()
			.stream()
			.filter(entry->entry.getValue()==1)
			.findFirst()
			.map(entry->entry.getKey());
			
			
			
			System.out.println ("Character is:"+chr.get());
			 
		
		
//		List<Employee> ecEmps = employees
//		.stream()
//		.filter(emp->emp.getDept().equals(new String("EC")))
//		.collect(Collectors.toList());
//		
//
//
//		ecEmps.forEach(emp->System.out.println(emp.getName()));
//		
//		List<String> ecNames = ecEmps
//		.stream()
//		.map(Employee::getName)
//		.collect(Collectors.toList());
//		
//		System.out.print(ecNames);
		
//		Map<String, List<Employee>> map1 = employees
//		.stream()
//		.collect(Collectors.groupingBy(Employee::getDept));
//		
//		map.forEach((k,v)-> System.out.println("Dept:"+k+
//												"Employee:"+((Employee)v).getName()));
		
//		System.out.println("Printing employee names using streams");
//		employees.stream()
//		.map(Employee::getName)
//		.forEach(name->System.out.println(name));
		
		
		Map<String, List<Employee>> map1 = employees
		.stream()
		.collect(Collectors.groupingBy(Employee::getDept));
		
		map1.forEach( (k, v)->{
			System.out.println("Department:"+k);
			v.forEach(emp->System.out.println(emp.getName())); 
			} );
		
		
		 // Example: Basic thread
        Runnable runnable =  new Runnable(){
          
		public void run(){
            System.out.println("This is inside runnable");
          }
        };

        Thread thread = new Thread(runnable);
        thread.start();
		
		
	}
}


class Employee{
	
	String id;
	String name;
	String dept;
	
	public Employee(String id, String name, String dept) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
}

	
	
	
	
