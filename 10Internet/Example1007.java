import java.io.*;
import java.net.*;
public class Example1007
{
	public static void main(String[] args)throws Exception
	{
		ServerSocket serverSocket=new ServerSocket(10001);
		while(true){
			Socket s=serverSocket.accept();
			new Thread(new ServerThread(s)).start();//每当和客户端建立Socket连接后，单独开启一个线程处理和客户端的交互
		}

	}
}
    class ServerThread implements Runnable
	{
		private Socket socket;
		public ServerThread(Socket socket){//构造方法
			this.socket=socket;
		}
		public void run(){
			String ip=socket.getInetAddress().getHostAddress();
			int count=1;
			try{
				InputStream in=socket.getInputStream();
				File parentFile=new File("d:\\upload\\");
				if(!parentFile.exists()){
					parentFile.mkdir();//创建该目录
				}
				
				//把客户端的IP地址作为上次文件的文件名
				File file=new File(parentFile,ip+"("+count+").jpg");
				while(file.exists()){
					file=new File(parentFile,ip+"("+(count++)+").jpg");
				}
				FileOutputStream fos=new FileOutputStream(file);
				byte[] buf=new byte[1024];
				int len=0;
				while((len=in.read(buf)) != -1){
					fos.write(buf,0,len);
				}
				OutputStream out=socket.getOutputStream();
				out.write("上传成功".getBytes());
				fos.close();
				socket.close();
				
				}catch(Exception e){
					throw new RuntimeException(e);
				}
		}
	}
	

