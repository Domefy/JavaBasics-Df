//5.42线程休眠实现了两个线程的交替执行
public class Example508{
  public static void main(String[] args)throws Exception{
    new Thread(new SleepThread()).start();        //创建一个线程
    for(int i=0;i<10;i++)
    {
	  	if(i==5)
      {
		    Thread.sleep(2000);                    //当前线程休眠2秒
		  }
		  System.out.println("主线程正在输出"+i);
		  Thread.sleep(500);
	  }
  }
}
class SleepThread implements Runnable{
  public void run()
  {
    for(int i=0;i<10;i++)
    {
      if(i==3){
        try{
          Thread.sleep(2000);
        }catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        
      }
      System.out.println("线程一正在输出"+i);
        try{
          Thread.sleep(500);
       }catch(Exception e)
       {
         e.printStackTrace();
       }
    }
  }
}