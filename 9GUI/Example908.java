import java.awt.*;
import java.awt.event.*;
public class Example908
{
	public static void main(String[] args){
		final Frame f=new Frame("Flowlayout");
		f.setLayout(new FlowLayout(FlowLayout.LEFT,20,30)); //所有组件左对齐，水平间距20，垂直间距30
		f.setSize(200,300);
		f.setLocation(300,200);
		Button btn1=new Button("第1个按钮");
		f.add(btn1);
		//每点击一次“第1个按钮”就向窗体中添加一个按钮
		btn1.addActionListener(new ActionListener()
		{
			private int num=1;
			public void actionPerformed(ActionEvent e)
			{
				f.add(new Button("第"+ +(num++) +"个按钮"));
				f.setVisible(true);  //刷新窗体显示新按钮
			}
		
		});
			f.setVisible(true); //设置窗体可见
	}
}