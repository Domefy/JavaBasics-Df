import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Example920 extends JFrame//单选框的应用
{
	private ButtonGroup group;
	private JPanel panel;
	private JPanel pallet;
	public Example920()
	{
		pallet=new JPanel();
		this.add(pallet,BorderLayout.CENTER);
		panel=new JPanel();
		group=new ButtonGroup();
		//调用addJRadioButton()方法
		addJRadioButton("灰");
		addJRadioButton("粉");
		addJRadioButton("黄");
		this.add(panel,BorderLayout.SOUTH);
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗体
		this.setVisible(true);
	}
	private void addJRadioButton(final String text){
		JRadioButton radioButton=new JRadioButton(text);//生产一个单选框
		group.add(radioButton);
		panel.add(radioButton);
		radioButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				Color color=null;

				if("灰".equals(text)){
					color=Color.GRAY;
				}else if("粉".equals(text)){
					color=Color.PINK;
				}else if("黄".equals(text)){
					color=Color.YELLOW;
				}else{
					color=Color.WHITE;
				}
				pallet.setBackground(color);//让中间的面板背景色变成单选框选择的
				
			}
		});
	}

	public static void main(String[] args)
	{
		new Example820();
	}
}