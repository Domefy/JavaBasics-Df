import java.awt.*;
class Layout extends Frame
{
	public Layout(String title)
	{
		GridBagLayout layout=new GridBagLayout();
		GridBagConstraints c=new GridBagConstraints();
		this.setLayout(layout);
		c.fill=GridBagConstraints.BOTH;
		c.weightx=1;
		c.weighty=1;
		//一个行里面有四个大小相同的Button
		this.addComponent("btn1",layout,c);
		this.addComponent("btn2",layout,c);
		this.addComponent("btn3",layout,c);
		c.gridwidth=GridBagConstraints.REMAINDER;
		this.addComponent("btn4",layout,c);

		//一行只有一个Button
		c.weightx=0;
		c.weighty=0;
		addComponent("btn5",layout,c);

		//一行有两个Button但是两个填满整个行
		c.gridwidth=1;
		this.addComponent("btn6",layout,c);
		c.gridwidth=GridBagConstraints.REMAINDER;
		this.addComponent("btn7",layout,c);


        //两行大小，左边一个大的Button右边两个Button叠加与左边的大小相同
		c.gridheight=2;
		c.gridwidth=1;
		c.weightx=2;
		c.weighty=2;
		this.addComponent("btn8",layout,c);
		c.gridwidth=GridBagConstraints.REMAINDER;
		c.gridheight=1;
		this.addComponent("btn9",layout,c);
		this.addComponent("btn10",layout,c);
		
		this.pack();
		this.setVisible(true);
	}
	//增加组件的方法
	private void addComponent(String name,GridBagLayout layout,GridBagConstraints c)
	{
		Button bt=new Button(name);
		layout.setConstraints(bt,c);
		this.add(bt);
	}
}
public class Example911
{
	public static void main(String[] args){
		new Layout("GridBagLayout");
	}
}