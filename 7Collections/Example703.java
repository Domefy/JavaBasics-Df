import java.util.*;
public class Example703
{
  //取出ArrayList集合中的所有元素

	public static void main(String[] args){
		ArrayList list=new ArrayList();
		list.add("stu1");
		list.add("stu2");
		list.add("stu3");
		list.add("stu4");

    //①简单点的方法 缺点 不能对其中的元素进行修改
    for(Object ob : list){     //用foreach循环取出集合中的元素
        System.out.println(ob);
    }

    //②复杂的方法
		Iterator it=list.iterator();  //获取Iterator对象,通过该对象遍历ArrayList中的所有元素
		while(it.hasNext()){     //判断ArrayList集合是否存在下一个元素
			Object obj=it.next(); //取出ArrayList集合中的元素
			System.out.println(obj);
		}
	}
}