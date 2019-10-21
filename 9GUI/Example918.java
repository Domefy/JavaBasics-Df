import java.awt.BorderLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Example918 extends JFrame {
	JButton sendBt;
	JTextField inputField;
	JTextArea chatContent;

	public Example918()// 将一个窗体分为showPanel，inputPanel两部分，并在其中添加控件
	{
		this.setLayout(new BorderLayout());
		chatContent = new JTextArea(12, 34);
		// 创建一个滚动面板，讲文本域作为其显示组件
		JScrollPane showPanel = new JScrollPane(chatContent);
		chatContent.setEditable(false);// 设置文本域不能编辑
		JPanel inputPanel = new JPanel();
		inputField = new JTextField(20);
		sendBt = new JButton("发送");
		// 为按钮添加事件
		sendBt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String content = inputField.getText();
				// 判断输入的信息是否为空
				if (content != null && !content.trim().equals("")) {
					// 如果不为空，将输入的文本追加到聊天窗口
					chatContent.append("本人:" + content + "\n");
				} else {
					chatContent.append("聊天信息不能为空" + "\n");

				}
				inputField.setText("");// 将文本框重新变为空

			}
		});
		Label label = new Label("聊天信息");
		inputPanel.add(label);
		inputPanel.add(inputField);
		inputPanel.add(sendBt);
		// 将滚动面板和JPanel面板添加到JFrame窗口
		this.add(showPanel, BorderLayout.CENTER);
		this.add(inputPanel, BorderLayout.SOUTH);
		this.setTitle("聊天窗口");
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Example718();
	}
}
