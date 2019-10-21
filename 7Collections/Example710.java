import java.util.HashSet;

class Student710 {
	String id;
	String name;

	public Student710(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return id + ":" + name;
	}

	// 没有重写hasCode() 和 equals()方法 导致2：Rose 重复的数据写入了 HashSet集合
	// 解决办法 重写上述两个方法
	/*
	 * //重写hashCode方法 public int hashCode(){ return id.hashCode(); }
	 * //重写equals方法 public boolean equals(Object obj){ if(this==obj){ return
	 * true; } if(!(obj instanceof Student)){ return false; } Student
	 * stu=(Student) obj; boolean b=this.id.equals(stu.id); return b;
	 * 
	 * }
	 */

}

public class Example710 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		Student710 stu1 = new Student710("1", "Jack");
		Student710 stu2 = new Student710("2", "Rose");
		Student710 stu3 = new Student710("2", "Rose");
		hs.add(stu1);
		hs.add(stu2);
		hs.add(stu3);
		System.out.println(hs);
	}
}
/*
 * 输出结果： [1:Jack, 2:Rose, 2:Rose]
 */