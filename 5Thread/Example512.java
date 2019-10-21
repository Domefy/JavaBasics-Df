//用sunchronized(lock)方法操作共享资源代码块解决了 多个线程共用一个资源 产生的安全问题

class Ticket1 implements Runnable
{
	private int tickets=10;

	Object lock=new Object();       //定义任意一个对象，用作同步代码块的锁，不能放在run()中，否则达不到同步的效果

	public void run(){
		while(true){
			synchronized (lock){        //定义同步代码块
				try{
					Thread.sleep(10);
				}catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				if(tickets>0){
					System.out.println(Thread.currentThread().getName()+"--卖出的票"+tickets--);
				}else{
					break;
				}
			}
		}
	}
}
public class Example512
{
	public static void main(String[] args){
		Ticket1 ticket=new Ticket1();
		new Thread(ticket,"线程一").start();
		new Thread(ticket,"线程二").start();
		new Thread(ticket,"线程三").start();
		new Thread(ticket,"线程四").start();
	}
}