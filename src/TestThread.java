
public class TestThread implements Runnable {

	private int sleepTime;

	public TestThread() {
		sleepTime = (int) (Math.random() * 6000);
	}

	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " going sleep for " + sleepTime);
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		
		System.out.println(Thread.currentThread().getName()+" finished");
	}

}
