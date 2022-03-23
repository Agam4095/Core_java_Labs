package Lab9;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;



public class Ex1 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("run " + Thread.currentThread().getName() + " " + i);
		}
	}

	public static void main(String[] args) {

		Ex1 exp = new Ex1();

//   	 1. Using newSingleThreadExecutor
//	ExecutorService exService = Executors.newSingleThreadExecutor();

//   	2. Using newCachedThreadPool
//	ExecutorService exService = Executors.newCachedThreadPool();

//   	3. Using newFixedThreadPool
//   	ExecutorService exService = Executors.newFixedThreadPool(3);

//   	4. Using newScheduledThreadPool
//		ExecutorService exService = Executors.newScheduledThreadPool(2);
		ScheduledExecutorService exService = Executors.newScheduledThreadPool(2);

		for (int i = 1; i <= 10; i++) {
			exService.execute(exp);
		}

		exService.shutdown();

	}

}