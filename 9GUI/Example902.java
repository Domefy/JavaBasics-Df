import java.awt.*;
import java.awt.event.*;
public class Example902
{
	public static void main(String[] args)
	{
		Frame f=new Frame("我的窗体");
		f.setSize(400,300);
		f.setLocation(300,200);
		f.setVisible(true);
		MyWindowListener mw=new MyWindowListener(); //为窗体添加关闭事件
		f.addWindowListener(mw);
	}
}
class MyWindowListener implements WindowListener //继承WindowListener接口
{
	public void windowClosing(WindowEvent e){
		Window window=e.getWindow();
		window.setVisible(false);
		window.dispose(); //释放窗体
	}
	public void windowActivated(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowDeactivated(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowOpened(WindowEvent e){}
}