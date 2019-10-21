import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Example916
{
	public static void main(String[] args){ //模式对话框只能让当前的对话框能活动的，非模式对话框反之
		//建立两个Button
		JButton btn1=new JButton("静态对话框");
		JButton btn2=new JButton("非静态对话框");
		JFrame f=new JFrame("DialogDemo");
		f.setSize(300,250);
		f.setLocation(300,200);
		f.setLayout(new FlowLayout());
		f.add(btn1);
		f.add(btn2);
		//设置点击关闭窗口
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		final JLabel label=new JLabel();
		final JDialog dialog=new JDialog(f,"Dialog");//对话框
		dialog.setSize(220,150);
		dialog.setLocation(350,250);
		dialog.setLayout(new FlowLayout());
		final JButton btn3=new JButton("确定");
		dialog.add(btn3);
		//为静态对话框Button添加点击事件
		btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				//设置对话框为模态
				dialog.setModal(true);
				if(dialog.getComponents().length==1)
				{
					dialog.add(label);
				}
				//否则标签的内容
				label.setText("模式对话框，点击确定Button关闭");
				dialog.setVisible(true);
			}
	});
		
		//为静态对话框Button添加点击事件
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			//设置对话框为模态
			dialog.setModal(false);
			if(dialog.getComponents().length==1)
			{
				dialog.add(label);
			}
			//否则标签的内容
			label.setText("非模式对话框，点击确定Button关闭");
			dialog.setVisible(true);
			}
	});
		
		//为静态对话框Button添加点击事件
		btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				dialog.dispose();
			}
		});
	}
}