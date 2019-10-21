import java.net.*;
public class Example1003
{
	public static void main(String[] args) throws Exception
	{
			DatagramSocket ds=new DatagramSocket(3000);
			String str="hello world";
			DatagramPacket dp=new DatagramPacket(str.getBytes(),str.length(),InetAddress.getByName("localhost"),8954);//端口8954必须与接收端的一致
			System.out.println("发送信息");
			ds.send(dp);
			ds.close();

	}
}