public class Example501 {
	public static void main(String[] args) {
		MyThread mythread = new MyThread();
		mythread.run();
		while (true) {
			System.out.println("main方法正在运行"); // 该方法不运行
		}
	}

}

class MyThread {
	public void run() {
		while (true) {
			System.out.println("MyTread中的run()正在运行！"); // 一直运行
		}
	}
}
