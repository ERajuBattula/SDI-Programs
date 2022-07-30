//Create a Thread Using Runnable Interface.

class Threading implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Device Is Ready To Use : " + MyThread.currentThread().getName());
	}

}

public class ThreadEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threading thrd = new Threading();
		for (int i = 0; i < 10; i++) {
			Thread t = new Thread(thrd);
			t.start();
		}
	}
}
