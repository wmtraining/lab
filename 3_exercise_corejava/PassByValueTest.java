package test;

//TODO what happens if updateName accepts PassByValue object and if you operate on it?
public class PassByValue {

	String name = "default";
	
	public void updateName(String newVal) {
		newVal = name;
		System.out.println("newVal inside method ="+newVal);
	}
	
	public static void main(String[] args) {
		
		String newName = "coreJava";
		PassByValue val = new PassByValue();
		val.updateName(newName);
		System.out.println("value after update="+newName);

	}

}
