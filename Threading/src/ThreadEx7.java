class priority extends Thread {
	@Override
	public void run() {
		System.out.println("ok : " + currentThread().getName());
	}
}

public class ThreadEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		priority t1 = new priority();
		priority t2 = new priority();
		priority t3 = new priority();

		t1.start();
		t1.setPriority(10);
		// System.out.println(t1);

		t2.start();
		t2.setPriority(5);
		// System.out.println(t2);

		t3.start();
		t3.setPriority(4);
		// System.out.println(t3);

	}

}
