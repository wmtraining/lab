package test;

//TODO check Anonymous Runnable vs  Lambda runnable
public class LambdaExample {

	  public static void main(String[] args) {
	    
	    System.out.println("=== RunnableTest ===");
	    
	    // Anonymous Runnable
	    Runnable r1 = new Runnable(){
	      
	      @Override
	      public void run(){
	        System.out.println("Hello world one!");
	      }
	    };
	    
	    r1.run();
	    
	    // Lambda Runnable
	    Runnable r2 = () -> System.out.println("Hello world Lambda..!.. run method implementation..");
	    
	    // Run 
	    r2.run();
	    
	  }
	}
