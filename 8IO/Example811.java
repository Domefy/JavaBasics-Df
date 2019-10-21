import java.io.*;
public class Example811{
  public static void main(String[] args)throws Exception       //将已有java代码 拷贝出来 并在文件中添加代码行
  {
    FileReader fr=new FileReader("Example09.java");  //创建字符流
    FileWriter fw=new FileWriter("copy.java");
    LineNumberReader lr=new LineNumberReader(fr);
	  lr.setLineNumber(0);
	  String line=null;
	  while((line=lr.readLine())!=null)
    {
		  fw.write(lr.getLineNumber()+":"+line);     //写入文件
		  fw.write("\r\n");
	  }
    lr.close();
    fw.close();
  }

}