public class Example602
{
	public static void main(String[] args){
		String s="abcdedcba";
	
		 System.out.println("字符串长度为："+s.length());            //字符串用的是 length（） 要加 ()
		 System.out.println("字符串中第一个字符为："+s.charAt(0));
		 System.out.println("字符c第一次出现的位置："+s.indexOf('c'));
		  System.out.println("字符c最后一次出现的位置："+s.lastIndexOf('c'));
		
	}
}