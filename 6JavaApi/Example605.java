public class Example605
{
	public static void main(String[] args){
		String s1="String";
		String s2="Str";

    String s3=new String("abc");
    String s4=new String("abc");


		System.out.println("判断是否以字符串Str开头:"+s1.startsWith("Str"));
		System.out.println("判断是否以字符串ng结尾:"+s1.endsWith("ng"));
		System.out.println("判断是有包含字符串tri:"+s1.contains("tri"));
		System.out.println("判断字符串是否为空:"+s1.isEmpty());
		System.out.println("判断两个字符串是否相等:"+s1.equals(s2));

    System.out.println(s3==s4);              //false 因为内存地址不一样  
    System.out.println(s3.equals(s4));       //true 
	}
}