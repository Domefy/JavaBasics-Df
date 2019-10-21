import java.io.*;
public class Example804{
  public static void main(String[] args) throws Exception
  {
    //读取
    InputStream in=new FileInputStream("source/1.txt");
    //输出
    OutputStream out=new FileOutputStream("1.txt");
    int len;
    long begintime=System.currentTimeMillis();
    while((len=in.read()) != -1){
      out.write(len);
    }
    long endtime=System.currentTimeMillis();
    System.out.println("拷贝文件所消耗的时间是："+(endtime-begintime)+"毫秒");
    in.close();
    out.close();
  }
}