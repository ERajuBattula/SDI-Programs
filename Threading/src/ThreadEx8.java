class Daemon extends Thread{
    public void run(){
        if(currentThread().isDaemon()){
            System.out.println("Demon thread : "+Thread.currentThread().getName());
        }
        else{
            System.out.println("User thread : "+Thread.currentThread().getName());
        }
    }
}
public class ThreadEx8 {
	  public static void main(String[] args) {
	        Daemon t1 = new Daemon();
	        Daemon t2 = new Daemon();
	        Daemon t3 = new Daemon();
	        t2.setDaemon(true);

	        t1.start();
	        t2.start();
	        t3.start();

	    }
	}

