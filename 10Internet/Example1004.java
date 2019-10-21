import java.io.*;
import java.net.*;
public class Example1004
{
	
	//TCP服务器
	public static class TCPServer
	{
		private static final int PORT=7788;
		public void listen() throws Exception{
			ServerSocket serverSocket=new ServerSocket(PORT);
			Socket client=serverSocket.accept();   //接受数据
			OutputStream os=client.getOutputStream(); //获取客户端的的输出流
			System.out.println("开始与客户端交互数据");
			os.write(("传智播客欢迎你！").getBytes());
			Thread.sleep(5000);
			System.out.println("结束与客户端交互数据");
			os.close();
			client.close();
		}
	}

	public static void main(String[] args) throws Exception
	{
		new TCPServer().listen();

	}
	

}