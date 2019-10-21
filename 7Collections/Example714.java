import java.util.*;
public class Example714
{
	public static void main(String[] args){
		TreeSet ts=new TreeSet(new MyComparator721());      //创建TreeSet对象时，传入自定义比较器
		ts.add("Jack");
		ts.add("Helena");
		ts.add("Eve");
		Iterator it=ts.iterator();
		while(it.hasNext()){
			Object obj=it.next();
			System.out.println(obj);
		}

	}
}
class MyComparator implements Comparator          //定义比较器实现Compatator接口    实现字符串可以按照长度来进行排序
{
	public int compare(Object obj1,Object obj2){
		String s1=(String) obj1;
		String s2=(String) obj2;
		int temp=s1.length() - s2.length();
		return temp;                                 //返回长度
	}
}