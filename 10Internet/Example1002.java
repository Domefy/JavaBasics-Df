import java.net.*;
public class Example1002
{
	public static void main(String[] args) throws Exception
	{
			byte[] buf=new byte[1024];
			DatagramSocket ds=new DatagramSocket(8954);//用于监听8954端口
			DatagramPacket dp=new DatagramPacket(buf,1024);//用于接收数据
			System.out.println("等待接收数据");
			ds.receive(dp);
			String str=new String(dp.getData(),0,dp.getLength())+" from "+dp.getAddress().getHostAddress()+":"+dp.getPort();
			System.out.println(str);
			ds.close();
	}
}
/*
接收端 接收Example03发过来的数据
运行结果：
等待接收数据
hello world from 127.0.0.1:3000
*/