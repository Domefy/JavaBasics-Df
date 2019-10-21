import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Cardlayout extends Frame implements ActionListener
{
	Panel cardPanel=new Panel();
	Panel controlpaPanel=new Panel();
	Button nextbutton,preButton;
	CardLayout cardLayout=new CardLayout();
	public Cardlayout(){
		setSize(300,200);
		setVisible(true);
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				Cardlayout.this.dispose();
		}});
		cardPanel.setLayout(cardLayout); //设置cardPanel面板为卡片布局
		//在cardPanel面板对象中添加3个文本标签
		cardPanel.add(new Label("第一个界面",Label.CENTER));
		cardPanel.add(new Label("第二个界面",Label.CENTER));
		cardPanel.add(new Label("第三个界面",Label.CENTER));
		//创建两个按钮对象
		nextbutton=new Button("下一张卡片");
		preButton=new Button("上一张卡片");
		//为按钮对象注册监听器
		nextbutton.addActionListener(this);
		preButton.addActionListener(this);
		//将按钮添加到controlpaPanel中
		controlpaPanel.add(preButton);
		controlpaPanel.add(nextbutton);
		//将cardPanel面板防止在窗口边界布局的中间，窗口默认为边界布局
		this.add(cardPanel,BorderLayout.CENTER);
		//将controlpaPanel面板放置在窗口边界布局的南区
		this.add(controlpaPanel,BorderLayout.SOUTH);

	}
	//实现按钮的监听触发，并对触发事件作出相应的处理
	public void actionPerformed(ActionEvent e){
		//如果用户单击nextbutton，执行的语句
		if(e.getSource()==nextbutton){
			//切换cardPanel面板中当前组件之后的一个组件
			cardLayout.next(cardPanel);
		}
		if(e.getSource()==preButton){
			//切换cardPanel面板中当前组件之前的一个组件
			cardLayout.previous(cardPanel);
		}
	}
}
public class Example912
{
	public static void main(String[] args)
	{
		Cardlayout cardlayout=new Cardlayout();
	}
}  
