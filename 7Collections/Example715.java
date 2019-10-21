import java.util.*;
public class Example715
{
	public static void main(String[] args){
		Map map=new HashMap();                         //创建HashMap() Map中的键必须是唯一的
		map.put("1","Jack");                           //用put()方法存入键值对
		map.put("2","Rose");
		map.put("3","Lucy");

   // map.put("3","Mary");                          //由于键值必须是唯一的，所以 Lucy 被覆盖掉了

		System.out.println("1:"+map.get("1"));          //get()方法 将键值对读取出来
		System.out.println("2:"+map.get("2"));
		System.out.println("3:"+map.get("3"));

    Set keySet=map.keySet();                        //第一种 先便利 Map集合中所有的键，再根据键获取相应的值
    Iterator it=keySet.iterator();
    while(it.hasNext()){
      Object key=it.next();
      Object value=map.get(key);                       //取出值
      System.out.println(key+":"+value);
    }
   

    Set entrySet=map.entrySet();                    //第二种方法 想获取集合中的所有的映射关系，然后从映射关系中取出键和值
		Iterator it2=entrySet.iterator();
		while(it2.hasNext()){
			Map.Entry entry=(Map.Entry)(it2.next());         //获取集合中键值对映射关系
			Object key=entry.getKey();
			Object value=entry.getValue();
			System.out.println(key+":"+value);
		}
    
	}
}

/* 运行结果
1:Jack
2:Rose
3:Lucy
1:Jack
2:Rose
3:Lucy
1:Jack
2:Rose
3:Lucy

*/
