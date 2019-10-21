import java.io.*;
public class Example823
{
	public static void main(String[] args)throws Exception
	{
		FileInputStream in1=new FileInputStream("stream1.txt");
		FileInputStream in2=new FileInputStream("stream2.txt");
		SequenceInputStream sis=new SequenceInputStream(in1,in2);        //将两个文件中的内容合并到一个文件中
		FileOutputStream out=new FileOutputStream("stream.txt");
		int len;
		byte[] buf=new byte[1024];
		while((len=sis.read(buf))!=-1){
			out.write(buf,0,len);
			out.write("\r\n".getBytes());
		}
		sis.close();
		out.close();
	}
}