
public class ThreadSync {

	int count = 0;

	public synchronized void increament() {
	count++;
	}

	public static void main(String[] args) {
		ThreadSync sync = new ThreadSync();
		sync.doWork();
	}

	public void doWork() {

		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 10000; i++) {
					increament();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 10000; i++) {
					increament();
				}
			}
		});

		t1.start();
		t2.start();
		System.out.println("Count:"+count);
	}
}
