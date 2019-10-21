
//9.2.2 事件适配器
import java.awt.Frame;
import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Example903 {
	public static void main(String[] args) {
		Frame f = new Frame("用事件适配器方法初始化窗体");
		f.setSize(400, 300);
		f.setLocation(300, 200);
		f.setVisible(true);
		f.addWindowListener(new MyWindowListener903());// 为窗口组件注册监听器

	}

}

// 继承WindowAdapter 重写 windowClosing()方法
class MyWindowListener903 extends WindowAdapter {
	public void windowClosing(WindowEvent e) {
		Window window = (Window) e.getComponent();
		window.dispose(); // 释放窗体
	}
}