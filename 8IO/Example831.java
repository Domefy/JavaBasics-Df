import java.io.*;
public class Example831
{
	public static void main(String[] args)throws Exception
  {//模拟软件试用次数
		RandomAccessFile raf=new RandomAccessFile("time.txt","rw");
		int times=0;
		times=Integer.parseInt(raf.readLine());  //将次数从文本读取出来    
		if(times>0){
			System.out.println("剩余"+times--+"次");
			raf.seek(0);
			raf.writeBytes(times+"");         //将次数在此写入文本
		  }else{
			System.out.println("软件的试用次数已经到了！");
		}
	}
}