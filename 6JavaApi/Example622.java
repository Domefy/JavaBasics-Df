import java.util.*;
class Example622 
{
	public static void main(String[] args) 
	{
		Date date1=new Date();
		Date date2=new Date(9666666666L);
		System.out.println(date1);
		System.out.println(date2);

		Calendar calendar=Calendar.getInstance();
		int year=calendar.get(Calendar.YEAR);
		int month=calendar.get(Calendar.MONTH)+1;
		int date=calendar.get(Calendar.DATE);
		int hour=calendar.get(Calendar.HOUR);
		int minute=calendar.get(Calendar.MINUTE);
		int second=calendar.get(Calendar.SECOND);
		System.out.println("当前时间"+year+"年"+month+"月"+date+"日"+hour+"时"+minute+"分"+second+"秒");
	}
}
