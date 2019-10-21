import java.util.*;
public class Example609
{
	public static void main(String[] args){
		//获取当前系统属性
		Properties properties =System.getProperties();
		Enumeration propertyNames=properties.propertyNames();
		while(propertyNames.hasMoreElements()){
			//获取系统属性的键key
			String key=(String)propertyNames.nextElement();
			//获得当前键key对应的值value
			String value=System.getProperty(key);
			System.out.println(key+"-->"+value);
		}
	}
}

