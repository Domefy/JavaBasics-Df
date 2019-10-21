import java.io.*;
public class Example805{
  public static void main(String[] args)throws Exception
  {
    InputStream in=new FileInputStream("source/1.txt");
    OutputStream out=new FileOutputStream("2.txt");

    byte[] buff=new byte[1024];          //定义一个字符数组，作为缓冲区   减少对文件的操作次数，提高了读写数据的效率

    int len;
    long begintime=System.currentTimeMillis();
    while((len=in.read(buff)) !=-1){
      out.write(buff,0,len);
    }
    long endtime=System.currentTimeMillis();
    System.out.println("拷贝文件所消耗的时间是："+(endtime-begintime)+"毫秒");
    in.close();
    out.close();
  }
 
}