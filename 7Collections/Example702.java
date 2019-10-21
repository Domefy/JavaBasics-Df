import java.util.*;
public class Example702
{
	public static void main(String[] args){
		LinkedList link=new LinkedList(); //创建LinkedList 集合
		link.add("stu1");
		link.add("stu2");
		link.add("stu3");
		link.add("stu4");
		System.out.println(link.toString());
		link.add(3,"Student"); //在指定位置插入元素
		link.addFirst("First"); //在第一个位置插入元素
		System.out.println(link);
		System.out.println(link.getFirst());
		link.remove(3);			//移除指定位置的元素
		link.removeFirst();
		System.out.println(link);
	}
}