import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Example922 extends JFrame {
	public Example922() {
		JMenuBar menuBar = new JMenuBar();// 菜单栏
		this.setJMenuBar(menuBar);
		JMenu menu = new JMenu("操作");// 菜单
		menuBar.add(menu);
		JMenuItem item1 = new JMenuItem("弹出窗口");// 菜单项
		JMenuItem item2 = new JMenuItem("关闭");
		item1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDialog dialog = new JDialog(Example922.this, true);
				dialog.setTitle("弹出窗口");
				dialog.setSize(200, 200);
				dialog.setLocation(50, 50);
				dialog.setVisible(true);

			}

		});

		item2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}

		});
		menu.add(item1);
		menu.addSeparator();// 添加一个分隔符
		menu.add(item2);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 300);
		this.setVisible(true);

	}

	public static void main(String[] args) {
		new Example622();
	}
}
