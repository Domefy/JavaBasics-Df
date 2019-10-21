public class Example503 {
	public static void main(String[] args) {
		MyThread503 myThread = new MyThread503();
		Thread thread = new Thread(myThread); // 创建线程对象
		thread.start();
		while (true) {
			System.out.println("main()方法在运行");
		}
	}
}

class MyThread503 implements Runnable {
	public void run() {
		while (true) {
			System.out.println("run运行");
		}
	}
}