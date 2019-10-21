import java.awt.*;
import java.awt.event.*;
public class Example907
{
	public static void main(String[] args) 
	{
		Frame f=new Frame("KeyEvent");
		f.setLayout(new FlowLayout());
		f.setSize(400,300);
		f.setLocation(300,200);
		TextField tf=new TextField(30);
		f.add(tf);
		f.setVisible(true);
		//为文本框添加键盘事件监听器
		tf.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e){
				int KeyCode=e.getKeyCode();
				String s=KeyEvent.getKeyText(KeyCode);
				System.out.println("输入的内容为："+s+",");
				System.out.println("对应的KeyCode为："+KeyCode);
			}
		});
	}
}
