//5.5.1线程安全   出现线程安全问题 票数为 0 -1 -2 的票号
class SaleThread implements Runnable
{
	private int tickets=10;
	public void run(){
		while(tickets>0){
			try{
				Thread.sleep(10);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
			
			System.out.println(Thread.currentThread().getName()+"---卖出的票"+tickets--);
		}
	}
}
public class Example511
{
	public static void main(String[] args)
	{
		SaleThread saleThread=new SaleThread();
		new Thread(saleThread,"线程一").start();
		new Thread(saleThread,"线程二").start();
		new Thread(saleThread,"线程三").start();
		new Thread(saleThread,"线程四").start();
	}
}