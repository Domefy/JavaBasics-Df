public class Test {
	public static void main(String[] args) {
		Thread t1 = new YieldThread5("线程A:");
		Thread t2 = new YieldThread5("线程B:");
		t1.start();
		t2.start();
	}
}

class YieldThread5 extends Thread {
	public YieldThread5(String name) {
		super(name);
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + "--" + i);
			if (i == 3) {
				System.out.print("线程让步");
				Thread.yield();
			}
		}
	}
}