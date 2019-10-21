import java.io.*;
public class Example809
{
	public static void main(String[] args)throws Exception
	{
		//创建一个FileWriter对象用于向文件中写入数据
		FileWriter writer=new FileWriter("writer.txt");
		String str="你好，传智播客";
		writer.write(str);
		writer.write("\r\n");                    //换行
		writer.close();
	}
}