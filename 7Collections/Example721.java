import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Example721 {
	public static void main(String[] args) {
		TreeMap tm = new TreeMap(new MyComparator721()); // 利用TreeMap 将 数据存储起来
		tm.put("1", "Jack");
		tm.put("2", "Rose");
		tm.put("3", "Lucy");
		Set keySet = tm.keySet();
		Iterator it = keySet.iterator();
		while (it.hasNext()) {
			Object key = it.next();
			Object value = tm.get(key);
			System.out.println(key + ":" + value);
		}
	}

}

class MyComparator721 implements Comparator {
	public int compare(Object obj1, Object obj2) {
		String id1 = (String) obj1;
		String id2 = (String) obj2;
		return id2.compareTo(id1);
	}
}
/*
 * 将外部类放在了主方法内报错 Example21.java:5: error: non-static variable this cannot be
 * referenced from a static context TreeMap tm=new TreeMap(new MyComparator());
 * ^ Note: Example21.java uses unchecked or unsafe operations. Note: Recompile
 * with -Xlint:unchecked for details. 1 error
 * 
 * 结果为： 3:Lucy 2:Rose 1:Jack
 */
