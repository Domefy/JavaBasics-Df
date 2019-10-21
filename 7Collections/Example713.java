import java.util.Iterator;
import java.util.TreeSet;

public class Example713 {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet(); // 存进排序二叉树的方法
		ts.add(new Student713("Jack", 19));
		ts.add(new Student713("Rose", 18));
		ts.add(new Student713("Tom", 19));
		ts.add(new Student713("Rose", 18));
		Iterator it = ts.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}

class Student713 implements Comparable {
	String name;
	int age;

	public Student713(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return name + ":" + age;
	}

	public int compareTo(Object obj) { // 重写compareTo 方法
		Student713 s = (Student713) obj;
		if (this.age - s.age > 0) { // 根与传进来的数值比较大小 先按照年龄排序
			return 1;
		}
		if (this.age - s.age == 0) { // 年龄相同，再按照姓名排序
			return this.name.compareTo(s.name);
		}
		return -1;
	}

}

/*
 * Rose:18 Jack:19 Tom:19
 */