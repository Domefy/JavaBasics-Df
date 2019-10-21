import java.util.*;
public class Example719
{
	public static void main(String[] args){
		Map map=new LinkedHashMap();                //LinkedHashMap()创建Map集合
		map.put("1","Jack");
		map.put("2","Rose");
		map.put("3","Lucy");
		Set keySet=map.keySet();
		Iterator it=keySet.iterator();
		while(it.hasNext()){
			Object key=it.next();
			Object value=map.get(key);             //获取每个键所对应的值
			System.out.println(key+":"+value);
		}
	}
}

/*
1:Jack
2:Rose
3:Lucy
*/