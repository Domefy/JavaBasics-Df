import java.util.*;
public class Example723
{
	public static void main(String[] args)
  {
		//ArrayList list=new ArrayList(); 
     /*
    /集合中的元素不能确定元素到底是什么类型，所以在取出元素时，进行强制类型转换就很容易出错

        Exception in thread "main" java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
        at Example23.main(Example23.java:12)
    */

    ArrayList<String> list= new ArrayList<String>();  //解决办法： 
		list.add("String");
		list.add("Collection");

    // list.add(1);       //使用泛形 ArrayList 集合只能存入String 类型元素
		
		for(String obj : list)
    {
			//String str=(String) obj ;   //在使用String 泛型 指出为 String 类型
      System.out.println(obj);
		}
	}
	
}

/* 报错 ：原因是多了或者少了 大括号
Example23.java:14: error: class, interface, or enum expected
}
^
1 error



*/