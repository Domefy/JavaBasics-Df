class Ticket513 implements Runnable {
	private int tickets = 10;

	public void run() {
		while (true) {
			saleTickets();
			if (tickets <= 0) {
				break;
			}
		}
	}

	private synchronized void saleTickets() { // synchronized修饰的方法
		if (tickets > 0) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "---卖出的票" + tickets--);
		}
	}
}

public class Example513 {
	public static void main(String[] args) {
		Ticket513 ticket = new Ticket513();
		new Thread(ticket, "线程一").start();
		new Thread(ticket, "线程二").start();
		new Thread(ticket, "线程三").start();
		new Thread(ticket, "线程四").start();
	}
}