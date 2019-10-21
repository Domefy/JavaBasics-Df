//5.4.3线程让步
public class Example509
{
	public static void main(String[] args){
		Thread t1=new YieldThread("线程A");
		Thread t2=new YieldThread("线程B");
		t1.start();
		t2.start();
	}
}
class YieldThread extends Thread
{
	public YieldThread(String name){
		super(name);                      //继承父类的构造方法
	}
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()+"--"+i);
			if(i==3){
				System.out.print("线程让步：");

				Thread.yield();            //线程运行到此，做出让步

			}
		}
	}

}