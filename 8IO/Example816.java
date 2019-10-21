import java.io.*;
public class Example816
{
	public static void main(String[] args) throws Exception
	{
		PrintStream ps=new PrintStream(new FileOutputStream("printStream.txt",true));
                                           //8.3.3 PrintStream将基本（引用）数据类型输出
		Student stu=new Student();
		ps.print("这是一个数字：");            //写入到文件中
		ps.println(19);
		ps.println(stu);
	}
}
class Student
{
	public String toString()
	{
		return "我是一个学生";
	}
}