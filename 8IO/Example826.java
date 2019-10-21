import java.io.File;
public class Example826
{
	public static void main(String[] args){
		File file=new File("/home/coding/workspace/8IO/");      //文件目录一定要是绝对路径 获取办法 ； file.getAbsolutePath()

    Boolean is=file.isDirectory();
    System.out.println(is);

		if(file.isDirectory()){  //判断File对象对应的目录是否存在
			String[] names=file.list();  //获取目录下的所有文件的文件名
			for(String name:names){
				System.out.println(name);//输出文件名
			}
		}
	}
}