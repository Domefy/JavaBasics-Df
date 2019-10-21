import java.awt.*;
import java.awt.event.*;
public class Example905
{
	public static void main(String[] args)
	{
		final Frame f=new Frame("WindowEvent");
		f.setSize(400,300);
		f.setLocation(300,200);
		f.setVisible(true);
		//创建内部类WindowListeners实例对象，监听窗体事件
		//f.addWindowListener(new WindowListener(){});
		f.addWindowListener(new WindowListener(){
			public void windowOpened(WindowEvent e){
				System.out.println("winowOpened---窗体打开事件");
			}
			public void windowIconified(WindowEvent e){
				System.out.println("windowIcoified---窗体图标化事件");
			}
			public void windowDeiconified(WindowEvent e){
				System.out.println("windowDeicon----窗体取消图标化事件");
			}
			public void windowDeactivated(WindowEvent e){
				System.out.println("windowDeactivated---窗体停用事件");
			}
			public void windowClosing(WindowEvent e){
				System.out.println("windowClosing---窗体正在关闭事件");
				((Window)e.getComponent()).dispose();
			}
			public void windowClosed(WindowEvent e){
				System.out.println("windowClose---窗体关闭事件");
			}
			public void windowActivated(WindowEvent e){
				System.out.println("windowActivated---窗体激活事件");
			}

		
		});
	}
}