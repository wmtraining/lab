import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownDemo {

  public static void main(String[] args) throws Exception {
    int threads = 3;
    final CountDownLatch startLatch = new CountDownLatch(threads);
    final CountDownLatch endLatch = new CountDownLatch(threads);

    ExecutorService svc = Executors.newFixedThreadPool(threads);
    for (int i = 0; i < threads; i++) {
      svc.execute(new Runnable() {
        public void run() {
          try {
            log("At run()");
            startLatch.countDown();
            startLatch.await();

            log("Do work");
            Thread.sleep((int) (Math.random() * 1000));

            log("Wait for end");
            endLatch.countDown();
			//use timeout in real code... await(60,TimeUnit.SECONDS)
            endLatch.await();

            log("Done");
          } catch (Exception e) {
            e.printStackTrace();
          }
        }
      });
      Thread.sleep(100);
    }
  }

  private static void log(String msg) {
    System.out.println(System.currentTimeMillis() + ": "
        + Thread.currentThread().getId() + "  " + msg);
  }
}