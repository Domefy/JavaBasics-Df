import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

public class ClickTest {     //实现 账号或密码 客户端 
	//模拟用户登录
	public static void main(String[] args) throws IOException {
		//创建socket对象
		Socket s=new Socket(InetAddress.getByName("127.0.0.1"),8888);
		//Socket s=new Socket("itheima",8888);
		//获取用户名和密码
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("请输入用户名：");
		String username=br.readLine();
		System.out.println("请输入密码：");
		String password=br.readLine();
		//获取输出流对象(换行)
		PrintWriter out=new PrintWriter(s.getOutputStream(),true);
		//写出数据
		out.println(username);
		out.println(password);
		//获取输入流对象
		BufferedReader serverBr=new BufferedReader(new InputStreamReader(s.getInputStream()));
		//获取服务器返回的数据
		String result=serverBr.readLine();
		System.out.println(result);
		//释放
		s.close();

	}

}
