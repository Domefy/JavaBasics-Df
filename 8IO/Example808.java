import java.io.*;
public class Example808
{
	public static void main(String[] args)throws Exception
	{
		FileReader reader=new FileReader("reader.txt");    //读取文件中的字符
		int ch;
		while((ch=reader.read())!=-1)
		{
			System.out.println((char)ch);               //read()返回的是int类型的值所以要将其转为char类型在打印
		}
		reader.close();
	}

}