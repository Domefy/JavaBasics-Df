
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {      //实现服务端  账号密码判断

	public static void main(String[] args) throws IOException {
		//创建服务器端socket对象
		ServerSocket ss=new ServerSocket(8888);
		//监听
		Socket s=ss.accept();
		//获取输入流对象
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		//判断用户名和密码是否正确
		String username=br.readLine();
		String password=br.readLine();
		//返回判断信息
		boolean flag=false;
		if("a".equals(username)&&"1234".equals(password)){
				flag=true;
		 }
		PrintWriter out=new PrintWriter(s.getOutputStream(),true);
				
		if(flag){
			out.println("登陆成功");
		}else{
			out.println("登录失败");
		}
		//释放资源
		s.close();
		//ss.close() 服务器不关闭

	}

}
