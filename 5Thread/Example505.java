
//完美解决四个线程共卖100张票
public class Example505 {
	public static void main(String[] args) {
		TicketWindow505 tw = new TicketWindow505();
		new Thread(tw, "窗口1").start();
		new Thread(tw, "窗口2").start();
		new Thread(tw, "窗口3").start();
		new Thread(tw, "窗口4").start(); // 创建一个线程对象并命名为窗口4，开启线程
	}
}

class TicketWindow505 implements Runnable {
	private int tickets = 100;

	public void run() {
		while (true) {
			if (tickets > 0) {
				Thread th = Thread.currentThread(); // 获取当前线程
				String th_name = th.getName();
				System.out.println(th_name + "正在发售第" + tickets-- + "张票");
			}
		}
	}
}
