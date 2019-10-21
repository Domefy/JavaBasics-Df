import java.io.File;
import java.io.FilenameFilter;
public class Example827
{
	public static void main(String[] args){
		File file=new File("/home/coding/workspace/8IO/");
		FilenameFilter filter=new FilenameFilter()            //文件过滤器 过滤掉不是.java的文件
    {
		  public boolean accept(File dir,String name)
		  {
			  File currFile=new File(dir,name);
			  if(currFile.isFile()&&name.endsWith(".java"))
			  {
				  return true;
		  	}else{
				  return false;
			  }
		  }
  	};
	  if(file.exists())
    {
	  	String[] lists=file.list(filter);
		  for(String name : lists)
      {
		  	System.out.println(name);
		  }
	  }
  }
}