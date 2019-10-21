import java.awt.*;
public class Example910 
{
	public static void main(String[] args) 
	{
		Frame f=new Frame("GridLayout");
		f.setLayout(new GridLayout(3,3)); //设置窗体为3*3的网格布局
		f.setSize(300,300);
		f.setLocation(400,300);
		for(int i=1;i<=9;i++){
			Button btn=new Button("btn"+i);
			f.add(btn);
		}
		f.setVisible(true);
	}
}
