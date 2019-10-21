import java.util.*;
public class Example708
{
	public static void main(String[] args){
		Vector v=new Vector();
		v.add("Jack");
		v.add("Rose");
		v.add("Tom");
		Enumeration en=v.elements();      //Enumeration接口 实现 便利 集合
		while(en.hasMoreElements()){
			Object obj=en.nextElement();
			System.out.println(obj);
		}
	}
}