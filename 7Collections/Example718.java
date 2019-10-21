import java.util.*;
public class Example718
{
	public static void main(String[] args){
		Map map=new HashMap();
		map.put("1","Jack");
		map.put("2","Rose");
		map.put("3","Lucy");
		Collection values=map.values();    //直接将Map中存储的所有值的Collection集合
		Iterator it=values.iterator();
		while(it.hasNext()){
			Object value=it.next();
			System.out.println(value);
		}
	}
}