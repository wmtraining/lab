package test;

//TODO fix issues in this program and run it
//TODO extend this class to add new features/properties. eg: self driving car, hybrid
//TODO extend and override printDetails method to print additional details. annotate with @Override
class Car {
    	
    	int currentSpeed;
    	String name;
		String modelYear;
		
		public Car()
		{			
		}
    	
    	public Car(String name) {
    		this.name = name;
    	}
    	
    	public void accelerate() {
    		currentSpeed = currentSpeed + 10;
    	}
    	
    	public void park() {
    		currentSpeed = 0;
    	}
    	
    	public void printDetails() {
    		System.out.println("name: " + name + "modelYear" + modelYear + ".");
    	}
		
		public static void main(){
			Car bmw = new Car("bmw")
			bmw.modelYear = 2018;
			System.out.println(bmw.printDetails());
		}
		
    }