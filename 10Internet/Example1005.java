import java.io.*;
import java.net.*;
public class Example1005
{
	public static void main(String[] args) throws Exception
		{
		new TCPClient().connect();
	}
	//TCP客户端
	public static class TCPClient
	{
		private static final int PORT=7788;
		public void connect() throws Exception{
			//创建一个Socket并连接到给出地址和端口号的计算机
			Socket client=new Socket(InetAddress.getLocalHost(),PORT);
			InputStream is=client.getInputStream();
			byte[] buf=new byte[1024];
			int len=is.read(buf);    //将数据读到缓冲区中
			System.out.println(new String(buf,0,len));
			client.close();
		}
	}
}
