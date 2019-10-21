import java.util.*;
public class Example706
{
	public static void main(String[] args){
		ArrayList list=new ArrayList();
		list.add("Jack");
		list.add("Annie");
		list.add("Rose");
		list.add("Tom");
		Iterator it=list.iterator();  
		while(it.hasNext()){
			Object obj=it.next();
			if("Annie".equals(obj)){
				list.remove(obj);        //调用集合对象的remove()方法去删除元素，因为迭代器
                                 //会抛出 ConcurrentModificationException异常
			  //break;                   //解决办法 一、找到该学生删除后 直接跳出 迭代器
        //it.remove();               //解决办法 二、用迭代器本身自带的 删除方法
      }
		}
		System.out.println(list);
	}
}

/*
Exception in thread "main" java.util.ConcurrentModificationException
        at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:909)
        at java.util.ArrayList$Itr.next(ArrayList.java:859)
        at Example06.main(Example06.java:12)

*/