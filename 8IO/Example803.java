import java.io.*;
public class Example803{
  public static void main(String[] args) throws Exception
  {
     //在已经有内容的文件中增加内容
    OutputStream out=new FileOutputStream("example.txt",true);
    String str="欢迎你";
    byte[] b=str.getBytes();
    for(int i=0;i<b.length;i++)
    {
      out.write(b[i]);
    }
    out.close();
  }

}