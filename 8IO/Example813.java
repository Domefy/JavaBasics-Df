import java.io.*;
public class Example813
{
	public static void main(String[] args) throws Exception
	{
		Person p=new Person("p1","张三",20);
		System.out.println("------写入文件前-----");
		System.out.println(p.getId()+"  ,"+p.getName()+"  ,"+p.getAge());
		//创建文件输出流对象
		FileOutputStream fos=new FileOutputStream("objectStream.txt");     //对象的序列化 将Person实例化对象 的数据以二进制形式保存到文件中
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(p);
	}
}
class Person implements Serializable      //必须继承Serializable接口
{
	private String id;
	private String name;
	private int age;
	public Person(String id,String name,int age)
	{
		super();
		this.id=id;
		this.name=name;
		this.age=age;
	}
	public String getId()
	{
		return id;	
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
}