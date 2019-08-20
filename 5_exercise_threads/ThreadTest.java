package test;

//TODO run, observe. understand how it works.

public class ThreadTest extends Thread {
	public void run() {
		long random = (long)  (Math.random() *100000000000L);
		System.out.println("random value="+random);
		for(long i=0;i<random; i++)
		{
			//do nothing. test
		}
		
		System.out.println("thread is running..." + new java.util.Date());
	}

	public static void main(String args[]) {
		ThreadTest t1 = new ThreadTest();
		t1.start();
		System.out.println("done- main");
	}
}