import java.util.*;
public class Example701
{
	public static void main(String[] args){
		ArrayList list=new ArrayList();  //创建ArrayList集合
		list.add("stu1");
		list.add("stu2");
		list.add("stu3");
		list.add("stu4");
		System.out.println("集合的长度："+list.size()); //长度
		System.out.println("第二个元素是："+list.get(1)); //取出元素
	}
}