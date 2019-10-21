import java.io.*;
public class Example612
{
	public static void main(String[] args)throws IOException,Exception{
		Runtime rt=Runtime.getRuntime();
		System.out.println("处理器个数："+rt.availableProcessors()+"个");
		System.out.println("空闲内存数量"+rt.freeMemory()/1024/1024+"M");
		System.out.println("最大可用内存数量"+rt.maxMemory()/1024/1024+"M");
		Process process=rt.exec("notepad.exe"); //打开记事本
		Thread.sleep(3000);
		process.destroy(); //关闭进程
	}
}