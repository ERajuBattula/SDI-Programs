//create Thread using Thread class

class MyThread extends Thread {

	public void run() {
		System.out.println("The Thread Is Executing : " + MyThread.currentThread().getName());
	}
}

public class ThreadEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			MyThread thread = new MyThread();
			thread.start();
		}
	}
}
