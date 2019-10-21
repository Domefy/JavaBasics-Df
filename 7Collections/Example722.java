import java.util.*;
public class Example722
{
	public static void main(String[] args){
		Properties p=new Properties();
		p.setProperty("backgroup-color","red");
		p.setProperty("Font-size","14px");
		p.setProperty("Language","chinese");
		Enumeration names=p.propertyNames();
		while(names.hasMoreElements()){
			String key=(String) names.nextElement();
			String value=p.getProperty(key);
			System.out.println(key+"="+value);
		}
	}
}
/* 运行结果：
backgroup-color=red
Language=chinese
Font-size=14px
*/