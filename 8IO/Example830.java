import java.io.*;
public class Example830
{
	public static void main(String[] args){
		File file=new File("/home/coding/workspace/8IO/delete1");
		deleteDir(file);         //调用FileDir删除方法
	}
	public static void deleteDir(File dir)
	{  
    if(dir.exists()){
      File[] files=dir.listFiles();
			for(File file:files)
			{
				if(file.isDirectory()){
					deleteDir(file);
				}else{
					file.delete();
				}
				
			}
			dir.delete();
	  }
  } 
}