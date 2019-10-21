//删除文件
import java.io.*;
public class Example829
{
  public static void main(String[] args){
    File file=new File("/home/coding/workspace/8IO/deleteTest"); //只能为文件夹目录
    if(file.exists()){
      System.out.println(file.delete());               //删除文件夹
    }
  }
}