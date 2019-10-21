//7.7 Collections工具类
import java.util.*;
public class Example727
{
	public static void main(String[] args){
		ArrayList list=new ArrayList();
		Collections.addAll(list,"C","Z","B","K");
		System.out.println("排序前"+list);
		Collections.reverse(list);
		System.out.println("排序后"+list);
		Collections.sort(list);
		System.out.println("按照自然顺序排序后："+list);
		Collections.shuffle(list);
		System.out.println("洗牌后"+list);

    //Example28
    ArrayList list1=new ArrayList();
		Collections.addAll(list1,-3,2,9,5,8);
		System.out.println("集合中的元素："+list1);
		System.out.println("集合中的最大元素："+Collections.max(list1));
		System.out.println("集合中的最小元素："+Collections.min(list1));
		Collections.replaceAll(list1,8,0);                    //将集合中的 8 替换为0
		System.out.println("替换后的集合为；"+list1);
    
	}
}
/* 报错：    + 打成 , 
Example27.java:14: error: no suitable method found for println(String,ArrayList)
                System.out.println("洗牌后",list);
                          ^
    method PrintStream.println() is not applicable
      (actual and formal argument lists differ in length)
    method PrintStream.println(boolean) is not applicable
      (actual and formal argument lists differ in length)
    method PrintStream.println(char) is not applicable
      (actual and formal argument lists differ in length)
    method PrintStream.println(int) is not applicable
      (actual and formal argument lists differ in length)
    method PrintStream.println(long) is not applicable
      (actual and formal argument lists differ in length)
    method PrintStream.println(float) is not applicable
      (actual and formal argument lists differ in length)
    method PrintStream.println(double) is not applicable
      (actual and formal argument lists differ in length)
    method PrintStream.println(char[]) is not applicable
      (actual and formal argument lists differ in length)
    method PrintStream.println(String) is not applicable
      (actual and formal argument lists differ in length)
    method PrintStream.println(Object) is not applicable
      (actual and formal argument lists differ in length)
Note: Example27.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
1 error


运行结果：
排序前[C, Z, B, K]
排序后[K, B, Z, C]
按照自然顺序排序后：[B, C, K, Z]
洗牌后[Z, C, K, B]
*/