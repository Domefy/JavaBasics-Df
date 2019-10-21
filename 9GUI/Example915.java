import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;
public class Example915 extends JFrame //和Frame一样独立存在的顶级窗口
{
	public Example915()
	{
		this.setTitle("JFrameTest");
		this.setSize(200,300);
		//定义一个按钮组件
		JButton bt=new JButton("按钮");
		//设置流式布局管理器
		this.setLayout(new FlowLayout());
		//添加按钮组件
		this.add(bt);
		//设置点击关闭按钮时的默认操作
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new Example615();	
	}
}
