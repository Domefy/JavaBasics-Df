import java.io.*;
public class Example834
{
	public static void main(String[] args)throws Exception
	{
		Reader reader=new InputStreamReader(new FileInputStream("3.txt"),"GBK");
		Writer writer=new OutputStreamWriter(new FileOutputStream("4.txt"),"UTF-8");
		char[] chs=new char[100];
		int len;
		len=reader.read(chs);
		String str=new String(chs,0,len);
    writer.write(str);         //write 写成writer
		reader.close();
		writer.close();
	}
}