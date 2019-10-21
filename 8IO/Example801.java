import java.io.*;
public class Example801{
  public static void main(String[] args)throws Exception
  {
    FileInputStream in=new FileInputStream("test.txt");   //创建一个文件字节输入流    将文件里的内容读取出来
    int b=0;
    while(true){
      b=in.read();              //让b记住读取的一个字节
      if(b==-1){                //如果读取的字节为-1，跳出while循环
        break;
      }
      System.out.println(b);           
    }

    in.close();     //关闭IO流


    //把数据写入文件
    FileOutputStream out=new FileOutputStream("example.txt");
     String str="传智播客";
   byte[] c=str.getBytes();    //将要传入的数据转为数组形式
    for(int j=0;j<c.length;j++)
    {
      out.write(c[j]);
    }
     out.close();

    

  }

}

  

/*报错： 使用IO 流的时候，必须抛出异常 throws Exception
Example01.java:4: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
    FileInputStream in=new FileInputStream("test.txt");   //创建一个文件直接输入流
                       ^
Example01.java:7: error: unreported exception IOException; must be caught or declared to be thrown
      b=in.read();              //让b记住读取的一个字节
               ^
Example01.java:14: error: unreported exception IOException; must be caught or declared to be thrown
    in.close();     //关闭IO流
            ^
3 errors
*/