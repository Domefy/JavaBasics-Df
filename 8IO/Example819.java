import java.io.*;
public class Example819
{
	public static void main(String[] args) throws Exception               //实现多个线程之间的管道流
	{
		final PipedInputStream pis=new PipedInputStream();
		final PipedOutputStream pos=new PipedOutputStream();
		pis.connect(pos);

		//发送线程
		new Thread(new Runnable(){
			public void run(){
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				PrintStream ps=new PrintStream(pos);
				while(true)
				{
					try{
						System.out.print(Thread.currentThread().getName()+"要求输入内容：");
						ps.println(br.readLine());
						Thread.sleep(1000);
					}catch(Exception e){
						e.printStackTrace();
					}
				}
			}
		},"发送数据的线程").start();

		//接收线程
		new Thread(new Runnable(){
			public void run(){
				BufferedReader br=new BufferedReader(new InputStreamReader(pis));
				while(true){
					try{
						System.out.println(Thread.currentThread().getName()+"收到的内容："+br.readLine());

					}catch(IOException e){
						e.printStackTrace();
					}
				}
			}
		},"接收数据的线程").start();


	}
}