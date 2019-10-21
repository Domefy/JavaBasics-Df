import java.util.*;
public class Example832
{
	public static void main(String[] args)throws Exception
	{
		String str="传智";
		byte[] b1=str.getBytes();          //默认的码表编码
		byte[] b2=str.getBytes("GBK");
		System.out.println(Arrays.toString(b1));
		System.out.println(Arrays.toString(b2));
		byte[] b3 =str.getBytes("UTF-8");
		System.out.println(new String(b1,"GBK"));
		System.out.println(new String(b2,"GBK"));
		System.out.println(new String(b3,"UTF-8"));
		System.out.println(new String(b2,"ISO8859-1"));
		
	}
}