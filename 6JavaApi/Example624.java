import java.util.*;
class Example624  
{
	public static void main(String[] args) 
	{
		Calendar calendar=Calendar.getInstance();
		calendar.set(2008,7,8); //开始时间
		calendar.add(Calendar.DATE,100); //100天的工期
		int year=calendar.get(Calendar.YEAR);
		int month=calendar.get(Calendar.MONTH)+1;
		int date=calendar.get(Calendar.DATE);
		System.out.println("竣工日期为："+year+"年"+month+"月"+date+"日");
	}
}
