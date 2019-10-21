//8.2.4 转换流
import java.io.*;
public class Example812{
  public static void main(String[] args)throws Exception
  {
    FileInputStream in=new FileInputStream("src.txt");
	  InputStreamReader isr=new InputStreamReader(in); //将字节输入流转为字符输入流      操作的文件如果是图片 转换为字符流 会丢失数据
	  BufferedReader br=new BufferedReader(isr);       //包装
	  FileOutputStream out=new FileOutputStream("de.txt");
  	OutputStreamWriter osw=new OutputStreamWriter(out);
	  BufferedWriter bw=new BufferedWriter(osw);
	  String line;
	  while((line=br.readLine())!=null)
    {
		  bw.write(line);
	  }
	  br.close();
  	bw.close();

  }

}