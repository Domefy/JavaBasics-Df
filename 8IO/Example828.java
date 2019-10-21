import java.io.File;
public class Example828
{
	public static void main(String[] args){
		File file=new File("/home/coding/workspace/8IO/");
		fileDir(file);         //调用FileDir删除方法
	}
	public static void fileDir(File dir)
	{
			File[] files=dir.listFiles();
			for(File file:files)
			{
				if(file.isDirectory()){
					fileDir(file);                //用递归的方法将文件及其子目录遍历出来
				}
				System.out.println(file.getAbsolutePath()); //输出文件的绝对路径
			}
	}
}