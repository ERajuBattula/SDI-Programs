import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Worker implements Runnable {
	private String message;

	public Worker(String message) {
		this.message = message;
	}

	public void run() {
		System.out.println("Now " + Thread.currentThread().getName() + " has started with message " + message);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		System.out.println("Now " + Thread.currentThread().getName() + " Has finished its execution");
	}

}

public class ThreadPoolEx1 {
	public static void main(String[] args) throws InterruptedException {
		ExecutorService execute = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 5; i++) {
			Worker worker = new Worker(" Boomer " + i);
			execute.execute(worker); // it will Handle Life cycle of a thread
		}
		execute.shutdown();

		while (!execute.isTerminated()) {
		}
		System.out.println("Done with all Thread");
	}
}