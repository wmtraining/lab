package test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//TODO create Employee inner class ad make stream aggregate-count work.
//TODO add code blocks to use parallel stream instead of sequential and compare time taken.. 
//point to know about parallel stream and when to use...

//TODO modify filter predicate and add codition to check salary >20K and less than 30K
public class StreamTest {

	public static void main(String[] args) {

		long start, end;
		List<Employee> eList = new ArrayList<Employee>();
			eList.add(new Employee("E1", 2000));
			eList.add(new Employee("E2", 42000));
			eList.add(new Employee("E3", 150));
			eList.add(new Employee("E4", 23456));
			eList.add(new Employee("E5", 200));
			eList.add(new Employee("E5", 18000));

		// go step by step...
		Stream<StreamTest.Employee> stream = eList.stream();
		long count = stream.filter(e -> e.getSalary() > 20000).count();

		// sequential stream
		start = System.currentTimeMillis();
		System.out.println("Sequential Stream Count= " + eList.stream().filter(e -> e.getSalary() > 20000).count());

		end = System.currentTimeMillis();
		System.out.println("Sequential Stream Time Taken?= " + (end - start) + "\n");

	}



}