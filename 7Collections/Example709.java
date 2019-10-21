import java.util.*;
public class Example709
{
	public static void main(String[] args){   //set接口 的 Hasset     取出来的元素顺序与添加元素的顺序不一致 重复存入的 Rose被去除了
		HashSet set=new HashSet();
		set.add("Jack");
		set.add("Eve");
		set.add("Rose");
		set.add("Rose");
		Iterator it=set.iterator();
		while(it.hasNext()){
			Object obj=it.next();
			System.out.println(obj);
		}
	}
}
/*
Eve
Rose
Jack
*/