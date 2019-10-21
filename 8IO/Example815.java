import java.io.*;
public class Example815
{
	public static void main(String[] args) throws Exception
	{
		//写入
		FileOutputStream fos=new FileOutputStream("source/dataStream.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		DataOutputStream dos=new DataOutputStream(bos);       //DataOutputStream 缺点：读取数据的顺序必须和写数据的顺序保持一致
		dos.writeByte(12);
		dos.writeChar('1');
		dos.writeBoolean(true);
		dos.writeUTF("同学，你好！");

    dos.close();      //没有这句报出   java.io.EOFException错误       

		//读出
    
		FileInputStream fis=new FileInputStream("source/dataStream.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		DataInputStream dis=new DataInputStream(bis);
		System.out.println(dis.readByte()+"  ,"+dis.readChar()+"  ,"+dis.readBoolean()+"  ,"+dis.readUTF());
    
    
		dis.close();     //漏了这句 产生这个错误
    /*Exception in thread "main" java.io.EOFException
        at java.io.DataInputStream.readByte(DataInputStream.java:267)
        at Example15.main(Example15.java:18)*/
    

	}
}

