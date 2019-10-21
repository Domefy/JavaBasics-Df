//5.4.4线程插队
class EmergencyThread implements Runnable
{
	public void run(){
		for(int i=0;i<6;i++){
			System.out.println(Thread.currentThread().getName()+"输入："+i);
			try{
				Thread.sleep(500);
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
public class Example510
{
	public static void main(String[] args) throws Exception{
		Thread t=new Thread(new EmergencyThread(),"线程一");
		t.start();
		for(int i=1;i<6;i++){
			System.out.println(Thread.currentThread().getName()+"输入"+i);
			if(i==2){
				t.join();          //调用join方法,让t线程插主线程main的队
			}
				Thread.sleep(500);
		}
	}
}