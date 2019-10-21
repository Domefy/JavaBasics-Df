import java.io.*;
public class Example820
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream in=new FileInputStream("source1.txt");
		ByteArrayOutputStream bos=new ByteArrayOutputStream();  //将文件数据读取到对象缓冲区中
		FileOutputStream out=new FileOutputStream("target1.txt");
		int b;
		while((b=in.read())!=-1){
			bos.write(b);
		}
		in.close();
		bos.close();
		out.write(bos.toByteArray());     //将缓冲区中的数据一次性写入文件
		out.close();

    //读取缓冲区的数据
    byte[] bufs=new byte[]{97,98,99,100};
    ByteArrayInputStream bis=new ByteArrayInputStream(bufs);
    int c;
    while((c=bis.read())!=-1)
    {
      System.out.println((char)c);       //减缓冲区的数据变成字符输出

    }

    

	}
}
/*报错： 原因 source1.txt 文件不存在
Exception in thread "main" java.io.FileNotFoundException: source1.txt (No such file or directory)
        at java.io.FileInputStream.open0(Native Method)
        at java.io.FileInputStream.open(FileInputStream.java:195)
        at java.io.FileInputStream.<init>(FileInputStream.java:138)
        at java.io.FileInputStream.<init>(FileInputStream.java:93)
        at Example20.main(Example20.java:6)
*/