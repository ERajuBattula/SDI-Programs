//Thread using Join()

class Join extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}

public class ThreadEx4 {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		Join t1 = new Join();
		Join t2 = new Join();
		Join t3 = new Join();

		t1.start();
		t1.join();
		t2.start();
		t3.start();
	}

}
