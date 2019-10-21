//5.5.4死锁问题
public class Example514
{
	public static void main(String[] args){
		//创建两个对象
		DeadLockThread d1=new DeadLockThread(true);
		DeadLockThread d2=new DeadLockThread(false);
		//创建并开启两个线程
		new Thread(d1,"Chinese").start();
		new Thread(d2,"American").start();
	}
}
class DeadLockThread implements Runnable
{
	static Object chopsticks=new Object();
	static Object knifeAndFork=new Object();
	private boolean flag;
	DeadLockThread(boolean flag){     //定义有参数的构造方法
		this.flag=flag;
	}
	public void run(){
		if(flag){
			while(true){
				synchronized(chopsticks)           //chopsticks锁对象的同步代码块
				{
					System.out.println(Thread.currentThread().getName()+"---if---chopsticks");
					synchronized(knifeAndFork){      //knifeAndFork锁对象的同步代码块
					System.out.println(Thread.currentThread().getName()+"---if---knifeAndFork");
	
				}
			}
		}
	}else{
		while(true){
			synchronized(knifeAndFork){
				System.out.println(Thread.currentThread().getName()+"--else--knifeAndFork");
				synchronized(chopsticks){
					System.out.println(Thread.currentThread().getName()+"---else---chopsticks");
				}
			}

		}
	}
  }
}