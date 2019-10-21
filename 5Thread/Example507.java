//优先级大的先执行，然后优先级低的再执行
class MaxPriority implements Runnable{
  public void run(){
    for(int i=0;i<10;i++){
      System.out.println(Thread.currentThread().getName()+"正在输出"+i);
    }
  }
}
class MinPriority implements Runnable{
  public void run(){
    for(int i=0;i<10;i++){
      System.out.println(Thread.currentThread().getName()+"正在输出"+i);
    }
  }
}
public class Example507{
  public static void main(String[] args){
    //新建两个线程
    Thread minPriority =new Thread(new MinPriority(),"优先级较低的线程");
    Thread maxPriority =new Thread(new MaxPriority(),"优先级较高的线程");
    minPriority.setPriority(Thread.MIN_PRIORITY);  //设置线程优先级为1
    maxPriority.setPriority(10);                  //设置线程的优先级为10

    //开启两个线程
    maxPriority.start();
    minPriority.start();
  }
}