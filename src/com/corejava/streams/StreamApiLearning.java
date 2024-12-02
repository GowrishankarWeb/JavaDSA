package com.corejava.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;
/*
	Stream is manipulating data without storing them or storing them temporarily only while printing
	so it is very fast.
	before stream there is iteration and sequential processing
	streaming collection of data using collections and arrays
	do parallel processing using streams
	internal for loop iteration.
	improves code readability
	
	Stream - single thread, answer is platform independent
	parallel stream - multi thread, answer is platform dependent
	
	stream is a important interface in stream API.
	java.util.Stream
	Stream.empty(), Stream.of() using we can create streams.
	
	we can process the collection or array without storing them
	
	from collection ---> intermediate operation filter(), map() etc..
		
			-filter(predicate) ==> return type will be boolean
			-map(function) ==> return type will be any
	       		function will accept any list of object and return any list of objects
	       		map(list of object -> list of objects)
		
	
			->intermediate operations are lazy operations
				 sorted(), stream(), distinct()
				 
	we can get the personal processed data from the collections == Temporary data
	----> after intermediate operation -----> Terminal operations forEach(), min(), max()
			terminal operations are eager operations
			terminal operations call the intermediate operations
	
	 if we store stream as object, it can be used only once.
	
	 optional class ==>>
			 it contains a value, which must be a non-null value;
			 If a value is present, isPresent() will return true and get() will return the value.
*/
public class StreamApiLearning {

	public static void main(String[] args) {
		
		int[] array= {5,2,1,4,7,49,4,7,4,41,254,2,5,51,54,2,29,5,5,322,565,464,4,6};
		
		System.out.println("Count "+ Arrays.stream(array).count());
		
		Arrays.stream(array).forEach(n->System.out.print(n+" "));
		System.out.println();
		System.out.println("filtering even numbers in the array and multiplying each element by 10");
		Arrays.stream(array).filter(n->n%2==0).map(n->n*10).forEach(n-> System.out.print(n+" "));

		System.out.println();
		System.out.println("Max = "+Arrays.stream(array).filter(n->n%2==0).map(n->n*10).max().getAsInt());
		System.out.println("Min = "+Arrays.stream(array).filter(n->n%2==0).map(n->n*10).min().getAsInt());
		System.out.println("Average = "+Arrays.stream(array).filter(n->n%2==0).map(n->n*10).average().getAsDouble());
		System.out.println("Sorted array");
		Arrays.stream(array).sorted().forEach(n-> System.out.print(n+" "));
		System.out.println("\nSorted Distinct elements in an array");
		Arrays.stream(array).sorted().distinct().forEach(n-> System.out.print(n+" "));
		System.out.println("\nFirst element in the array = "+Arrays.stream(array).findFirst().getAsInt());
		System.out.println("Any element in the array = "+Arrays.stream(array).findAny().getAsInt());  //But 99% it will return 1st element only

		
		List<String> strList=new ArrayList<>();
		strList.add("sdsdwes");
		strList.add("ryrt");
		strList.add("fghf");
		strList.add("wer");
		strList.add("yuk");
		strList.add("lsde");
		strList.add("hgjyt");
		strList.add("iopui");
		strList.add("jljlhj");
		strList.add("etrtyrt");
		strList.add("kkhjf");
		strList.add("aas");
		
		System.out.println("\n-----------------------------------");
		System.out.println("\nSorting every element in list in insertion order");
		strList.stream().sorted((elem1,elem2)->1).forEach(s->System.out.print(s+" "));
		 //((elem1,elem2)->-1) this will reverse the insertion order
		 //((elem1,elem2)->0,1 etc) this will reverse the insertion order
		System.out.println("\n-----------------------------------");
		System.out.println("\nSorting the list of Strings");
		strList.stream().sorted().forEach(s->System.out.print(s+" "));	
		
		System.out.println("\n-----------------------------------");
		System.out.println("\nConverting every string in list to uppercase");
		strList.stream().sorted().map(s->s.toUpperCase()).forEach(s->System.out.print(s+" "));
		
		
		List<Integer> al=new ArrayList<>();
		al.add(54);
		al.add(345);
		al.add(567);
		al.add(79);
		al.add(345);
		al.add(2);
		al.add(325);
		al.add(879);
		al.add(2758);
		al.add(456);
		al.add(386);
		al.add(486);
		al.add(76);
		
		System.out.println("\n-----------------------------------");
		System.out.println("\nMultiplying every element with 10");
		al.stream().map(n->n*10).forEach(n->System.out.print(n+" "));
		
		System.out.println("\n-----------------------------------");
		System.out.println("\nAdding Hello string to every strings in the list");
		strList.stream().map(n->n+" Hello").forEach(n->System.out.print(n+" "));
		
		System.out.println("\n-----------------------------------");
		System.out.println("\nLimits first 5 elements"); 
		al.stream().limit(5).forEach(n->System.out.print(n+" "));
		
		System.out.println("\n-----------------------------------");
		Object[] arr=	al.stream().limit(5).toArray();
		System.out.println(Arrays.toString(arr));
		
		System.out.println("\n-----------------------------------");
		System.out.println("\nMax element in a arraylist");
		System.out.println(al.stream().max((elem1,elem2)->elem1.compareTo(elem2)).get());
		
		
		System.out.println("\n-----------------------------------");
		System.out.println("\nParallel Stream is normally unordered, because it is operated on multiple threads");
		al.parallelStream().forEach(n->System.out.print(n+" "));
	
		System.out.println("\nWe can order them to insertion order using forEachOrdered");
		al.parallelStream().forEachOrdered(n->System.out.print(n+" "));
		
		System.out.println("\n-----------------------------------"
				+ "\nwe can convert the stream into parallel stream by using");
		al.stream().parallel().forEach(n->System.out.print(n+" "));
		
		System.out.println();
		
		Map<String, Integer> map=new HashMap<>();
		map.put("Hari",100);
		map.put("Bala",200);
		map.put("Somu",300);
		map.put("Ramu",400);
		map.put("Pari",500);
		map.put("Neha",600);
		
		//sorting only keys alone
		map.keySet().stream().sorted().forEach(n->System.out.print(n+" "));
		
		System.out.println("\n----------------------------------- sorting by key");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(n->System.out.print(n+" "));

		
		System.out.println("\n----------------------------------- to list");
		List<String> l =map.keySet().stream().collect(Collectors.toList());
		System.out.println(l.toString());
		
		System.out.println("\n----------------------------------- to set");
		Set<String> s =map.keySet().stream().collect(Collectors.toSet());
		System.out.println(s.toString());
		
		System.out.println("\n-----------------------------------");
		l.stream().filter(n->n.startsWith("H")&&n.endsWith("i")).forEach(n->System.out.print(n+" "));;
		
		System.out.println("\n-----------------------------------");
		int sum=Arrays.stream(array).sum();
		System.out.println(sum);
		OptionalInt max=Arrays.stream(array).max();
		System.out.println(max.getAsInt());
		OptionalInt min=Arrays.stream(array).min();
		System.out.println(min.getAsInt());
		
		System.out.println("\n-----------------------------------");
		al.stream().sorted().forEach(n->System.out.print(n+" "));
		
		
	}

}
