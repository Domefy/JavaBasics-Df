import java.io.*;
import java.net.*;
public class Example1008
{
	public static void main(String[] args) throws Exception 
	{
		Socket socket=new Socket("127.0.0.1",10001);
		OutputStream out=socket.getOutputStream();
		FileInputStream fis=new FileInputStream("D:\\1.jpg"); //图片位置
		byte[] buf=new byte[1024];
		int len;
		while((len=fis.read(buf))!=-1){
			out.write(buf,0,len);
		}
		socket.shutdownOutput();
		InputStream in=socket.getInputStream();
		byte[] bufMsg=new byte[1024];
		int num=in.read(bufMsg);
		String Msg=new String(bufMsg,0,num);
		System.out.println(Msg);
		fis.close();
		socket.close();
	}
}
