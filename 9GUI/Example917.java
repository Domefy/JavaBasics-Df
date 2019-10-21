import java.awt.*;
import javax.swing.*;
public class Example917 extends JFrame
{
	public Example917()
	{
		this.setTitle("PanelDemo");
		//创建滚动面板
		JScrollPane scrollPane=new JScrollPane();
		//设置水平滚动条策略--滚动条一直显示
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		//设置垂直滚动条
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		//定义一个JPanel面板
		JPanel panel=new JPanel();
		//在JPanel面板中添加四个Button
		panel.add(new Button("按钮1"));
		panel.add(new Button("按钮2"));
		panel.add(new Button("按钮3"));
		panel.add(new Button("按钮4"));

		//设置JPanel面板在滚动面板中显示
		scrollPane.setViewportView(panel);
		//将滚动面板添加到内容面板的CENTER区域
		this.add(scrollPane,BorderLayout.CENTER);
		//将一个按钮添加到内容面板的SOUTH区域
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400,250);
		this.setVisible(true);
	}
	public static void main(String[] args){
		new Example617();
	}
}