package test;

//TODO go through below code, run and test
//TODO create new interface with method for concatenating two strings and implement using Lambda with two parameters

@FunctionalInterface
interface MyInterface {

	// method with no parameter
	public String sayHello();
}

public class LambdaMulti {

	public static void main(String args[]) {
		// lambda expression
		MyInterface msg = () -> {
			return "Hello";
		};
		System.out.println(msg.sayHello());
	}
}

@FunctionalInterface
interface MyInterface2 {

	// A method with single parameter
	public int incrementByFive(int a);
}

public class Example {

	public static void main(String args[]) {
		// lambda expression with single parameter num
		MyInterface2 f = (num) -> num + 5;
		System.out.println(f.incrementByFive(22));
	}
}


