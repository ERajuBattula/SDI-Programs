//Thread using Sleep()

class Pause extends Thread {
	public void run() {

		System.out.println("Have A Good Day." + MyThread.currentThread().getName());
	}
}

public class ThreadEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 10; i++) {
			Pause p = new Pause();
			p.start();
			
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}

	}
}
