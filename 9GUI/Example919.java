import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Example919 extends JFrame
{
	private JCheckBox italic;
	private JCheckBox bold;
	private JLabel label;
	public Example919(){
		label=new JLabel("欢迎你",JLabel.CENTER);
		//设置标签文本的字体
		label.setFont(new Font("宋体",Font.PLAIN,20));
		this.add(label);
		JPanel panel=new JPanel();
		//创建两个复选框
		italic=new JCheckBox("ITALIC");
		bold=new JCheckBox("BOLD");
		//为复选框定义监听器
		ActionListener listener=new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int mode=0;
				if(bold.isSelected())
					mode+=Font.BOLD;
				if(italic.isSelected())
					mode+=Font.ITALIC;
				label.setFont(new Font("宋体",mode,20));
			}
		};
		//为两个复选框添加监听器
		italic.addActionListener(listener);
		bold.addActionListener(listener);
		//在JPanel面板添加复选框
		panel.add(italic);
		panel.add(bold);
		//在SOUTH域添加JPanel面板
		this.add(panel,BorderLayout.SOUTH);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,300);
		this.setVisible(true);
	}
		public static void main(String[] args)
		{
			new Example619();
		}
		
	
}