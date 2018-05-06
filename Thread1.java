class MyThreadA extends Thread {
	public void run() { // entry point for thread
		for (;;) {
			System.out.println("hello world1");
		}
	}
}

class MyThreadB extends Thread {
	public void run() { // entry point for thread
		for (;;) {
			System.out.println("hello world2");
		}
	}
}

public class Thread1 {
	public static void main(String [] args) {
		MyThreadA t1 = new MyThreadA();
		MyThreadB t2 = new MyThreadB();
		t1.start();
		t2.start();
		// main terminates, but in Java the other threads keep running
		// and hence Java program continues running
	}
}




