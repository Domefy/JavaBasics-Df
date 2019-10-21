public class Example502 {
	public static void main(String[] args) {
		MyThread502 mythread = new MyThread502();
		mythread.start(); // 开启线程
		while (true) {
			System.out.println("main方法正在运行"); // 中间一部分进行运行
		}
	}

}

class MyThread502 extends Thread // 继承线程
{
	public void run() {
		while (true) {
			System.out.println("MyTread中的run()正在运行！"); // 一直运行
		}
	}
}
