class Example601
{
	public static void main(String[] args){
		String str1=new String();         //创建一个空的字符串
		String str2=new String("abcd");
		char[] charArray=new char[]{'D','E','F'}; //创建一个字符数组
		String str3=new String(charArray);
		System.out.println("a"+str1+"b");
		System.out.println(str2);
		System.out.println(str3);
	}
}