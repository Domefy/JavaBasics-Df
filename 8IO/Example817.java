import java.io.*;
public class Example817
{
	public static void main(String[] args) throws Exception
	{
		StringBuffer sb=new StringBuffer();
		int ch;
		System.out.println("请输入一串字符：");
		while((ch=System.in.read())!=-1)           //读取系统键盘输入的字符是否到末尾
		{
			if(ch =='\r'||ch=='\n')           //当系统读取到回车或者换行就跳出循环
			{
				break;
			}
			sb.append((char)ch);
		}
		System.out.println(sb);
	}
}