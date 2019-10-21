import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Example814 {
	public static void main(String[] args) throws Exception {
		// 创建文件输入流对象，用于读取指定文件的数据
		FileInputStream fis = new FileInputStream("objectStream.txt"); // 反序列化
																		// 将存在文件中二进制的内容读取出来
		// 创建对象输入流，并且从指定的输入流中读取数据
		ObjectInputStream ois = new ObjectInputStream(fis);
		// 读取Person 对象
		Person814 p = (Person814) ois.readObject();
		System.out.println("-------从文件中读取后-----");
		System.out.println(p.getId() + "  ," + p.getName() + "   ," + p.getAge());

	}
}

class Person814 implements Serializable // 必须继承Serializable接口
{
	private String id;
	private String name;
	private int age;

	public Person814(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}
