public class Example607
{
	public static void main(String[] args){
		String s="avcdedcba";
		System.out.println(s.charAt(10));        //超出了索引字符范围 报错 StringIndexOutOfBoundsException
	}
}
/*
Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 10
        at java.lang.String.charAt(String.java:658)
        at Example07.main(Example07.java:5)
*/