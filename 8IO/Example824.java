import java.io.*;
import java.util.*;
public class Example824
{
	public static void main(String[] args)throws Exception
	{
		Vector vector=new Vector();
		//下面的代码是创建3个输入流对象
		FileInputStream fis1=new FileInputStream("source/1.txt");
		FileInputStream fis2=new FileInputStream("source/2.txt");
		FileInputStream fis3=new FileInputStream("source/3.txt");
		//下面的代码是向Vector中添加3个输入流对象
		vector.addElement(fis1);
		vector.addElement(fis2);
		vector.addElement(fis3);
		Enumeration e=vector.elements();        //获取Vector对象中的元素
		SequenceInputStream sis=new SequenceInputStream(e);
		FileOutputStream out=new FileOutputStream("stream24.txt");
		int len;
		byte[] buf=new byte[1024];      //创建一个大小为 1024个直接数组的缓冲区
		while((len=sis.read(buf))!=-1){
			out.write(buf,0,len);
		}
		sis.close();
		out.close();

	}
	

}