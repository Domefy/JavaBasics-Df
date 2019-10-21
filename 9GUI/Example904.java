import java.awt.*;
import java.awt.event.*;
public class Example904
{
	public static void main(String[] args)
	{
		Frame f=new Frame("匿名内部类来创建监听器对象");
		f.setSize(400,300);
		f.setLocation(300,200);
		f.setVisible(true);
		Button btn=new Button("Exit");
		f.add(btn);
		btn.addMouseListener(new MouseAdapter(){
			public void mouse(MouseEvent e){
				System.exit(0);
			}
		});
	}
}