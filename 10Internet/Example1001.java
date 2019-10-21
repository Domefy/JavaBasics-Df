import java.net.InetAddress;
public class Example1001 
{
	public static void main(String[] args) throws Exception
	{
		InetAddress localAddress=InetAddress.getLocalHost();
		InetAddress remoteAddress=InetAddress.getByName("www.itcast.cn");
		System.out.println("本机IP地址:"+localAddress.getHostAddress());
		System.out.println("itcast的IP地址："+remoteAddress.getHostAddress());
		System.out.println("3秒是否可达："+remoteAddress.isReachable(3000));
		System.out.println("itcast的主机名："+remoteAddress.getHostName());

	}
}
/*
运行结果：
本机IP地址:172.0.0.2
itcast的IP地址：49.79.239.100
3秒是否可达：false
itcast的主机名：www.itcast.cn
*/