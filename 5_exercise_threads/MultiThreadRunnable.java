
package test;

//exercise T1
//TODO run program and observe output. modify main method and start create and start another thread 
//and observe multiple threads running in parallel.
//you can add additional print statements..

//exercise T2
//TODO add String variable called data and assign default value (instance variable)
//What value is the data value used in t1 and what value is used in t2. 
//what is the scenario where we need differen values or instances?

//exercise T3
//TODO use Thread.sleep() instead of for loop. 
//you can try to use wait()/notify() as well
public class Multi3 implements Runnable {
	
	public Multi3()
	{
	}
	
	public Multi3(String data) {
	}
	
	public void run() {
		
		long random = (long)  (Math.random() *100000000000L);
		System.out.println("random value="+random);
		for(long i=0;i<random; i++)
		{
			//do nothing. just programmatic delay for test
		}
		
		System.out.println("thread..." + new java.util.Date());
	}

	public static void main(String args[]) {
		Multi3 m1 = new Multi3();
		Thread t1 = new Thread(m1);
		t1.start();
		
		System.out.println("done- main");
	}
}