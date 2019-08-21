package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//TODO run program understand what it does.
//TODO try toSet(). create collection with duplicate names and use set to remove duplicates etc..
public class StreamsMapSortOp {

	public static void main(String... args) {
		//Map
		List<Integer> number = Arrays.asList(10,20,2,4);
		List square = (List<Integer>) number.stream().map(x->x*x).collect(Collectors.toList());
		System.out.println(square);
		
		//sort
		List<String> names = Arrays.asList("Java","Golang","Python");
		List result = names.stream().sorted().collect(Collectors.toList());
		System.out.println(result);
		
		//filter & reduce
		List<Integer> number2 = Arrays.asList(1,2,3,4,5,6);
		int even = number2.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
		System.out.println(even);
	}
}
