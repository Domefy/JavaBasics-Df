import java.awt.*;
public class Example913
{
	public static void main(String[] args) 
	{
		Frame f=new Frame("hello");
		f.setLayout(null);
		f.setSize(300,150);
		Button btn1=new Button("press");
		Button btn2=new Button("pop");
		btn1.setLocation(40,60); //设置按钮的坐标
		btn1.setSize(100,30); //设置按钮的长宽
		//btn1.setBounds(40,60,100,30);相当于前面两句的结合
		btn2.setBounds(140,90,100,30);
		f.add(btn1);
		f.add(btn2);
		f.setVisible(true);
	}
}
