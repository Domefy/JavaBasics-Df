import java.io.*;
public class Example810
{
	public static void main(String[] args)throws Exception
  {
		FileReader reader=new FileReader("src.txt");
		BufferedReader br=new BufferedReader(reader);        //对输入和输出流进行包装
		FileWriter writer=new FileWriter("des.txt");
		BufferedWriter bw=new BufferedWriter(writer);
		String str;
		while((str=br.readLine())!=null){        //每次读取一行文本，判断是否有到文件末尾
			bw.write(str);
			bw.newLine();
		}
		br.close();
		bw.close();
	}
}