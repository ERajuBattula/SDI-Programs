//Interruption in Thread.

class Interupter implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Downloading The Data. " + Thread.currentThread().getName());
		for (int i = 0; i <Integer.MAX_VALUE; i++) {
			if (Thread.currentThread().isInterrupted()) {
				return;
			}
			System.out.println("Downloading Data : " + i);
		}
	}

}

public class ThreadEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interupter it=new Interupter();
		Thread thread = new Thread(it);
		thread.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thread.interrupt();
		System.out.println("Data Download Inturrepted From : " + Thread.currentThread().getName());

	}

}
