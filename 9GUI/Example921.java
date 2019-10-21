import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Example921 extends JFrame
{
	private JComboBox comboBox;
	private JTextField field;

	@SuppressWarnings("unchecked")

	public Example921(){
		JPanel panel=new JPanel();
		comboBox=new JComboBox();
		//为组合框添加选项
		comboBox.addItem("请选项城市");
		comboBox.addItem("北京");
		comboBox.addItem("天津");
		comboBox.addItem("南京");
		comboBox.addItem("上海");
		comboBox.addItem("重庆");
		//为组合框添加事件监听器
		
		comboBox.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String item=(String)comboBox.getSelectedItem();
				if("请选择城市".equals(item))
				{
					field.setText("");
				}else
				{
					field.setText("您选择的城市是："+item);
				}
			}
		});
		field =new JTextField(20);
		panel.add(comboBox);
		panel.add(field);
		//在内容面板中添加JPanel面板
		this.add(panel,BorderLayout.NORTH);
		this.setSize(350,100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}

	public static void main(String[] args)
	{
		new Example721();
	}
}

/*
报错：注: Example21.java使用了未经检查或不安全的操作。 注: 有关详细信息, 请使用 -Xlint:unchecked 重新编译。

解决办法:
@SuppressWarnings("unchecked")

*/