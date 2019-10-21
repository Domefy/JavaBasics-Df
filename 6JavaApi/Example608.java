//StringBuffer 类里面的一些方法 应用
public class Example608
{
	public static void main(String[] args){
		System.out.println("1.添加-------");
		add();
		System.out.println("2.删除-------");
		remove();
		System.out.println("3.修改--------");
		alter();
	}
	public static void add(){
		StringBuffer sb=new StringBuffer();
		sb.append("abcdefg");
		System.out.println("append添加结果为："+sb);
		sb.insert(2,"123");
		System.out.println("insert添加结果为："+sb);
	}
	public static void remove(){
		StringBuffer sb=new StringBuffer("abcdefg");
		sb.delete(1,5);                                   //索引下标从0开始，不包括5
		System.out.println("删除指定位置结果："+sb);
		sb.deleteCharAt(2);
		System.out.println("删除指定位置结果为；"+sb);
		sb.delete(0,sb.length());
		System.out.println("清空缓存区结果："+sb);
	}
	public static void alter(){
		StringBuffer sb=new StringBuffer("abcdef");
		sb.setCharAt(1,'p');
		System.out.println("修改指定位置字符结果："+sb);
		sb.replace(1,3,"qq");
		System.out.println("替换指定位置字符结果："+sb);
	}
}