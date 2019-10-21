
import java.awt.event.*;
import java.io.IOException;

import javax.swing.*;
import java.awt.*;
import java.net.*;
public class GuiChat extends JFrame
{
	private static final int DEFAULT_PORT=8899;
	//把主窗口分为上中下三部分
	private JLabel stateLB;//显示监听状态
	private JTextArea centerTextArea;//显示聊天记录
	private JPanel southPanel;//最下方面板
	private JTextArea inputTextArea;//聊天输入框
	private JPanel bottomPanel;//放置IP输入框，按钮
	private JTextField ipTextField;//IP输入框
	private JTextField remotePortTF;//端口号输入框
	private JButton sendBT;//发送
	private JButton clearBT;//清屏
	private DatagramSocket datagramSocket;//用于后面功能的实现

	private void setUpUI()
	{
		//初始化窗口
		setTitle("GUI聊天");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		setResizable(false);
		setLocationRelativeTo(null);//窗口居中
		//窗口上部分
		stateLB=new JLabel("当前还未启动监听");
		stateLB.setHorizontalAlignment(JLabel.RIGHT);
		//窗口中间部分
		centerTextArea=new JTextArea();
		centerTextArea.setEditable(false);
		centerTextArea.setBackground(new Color(211,211,211));
		//窗口底部
		southPanel=new JPanel(new BorderLayout());
		inputTextArea=new JTextArea(5,20);
		bottomPanel=new JPanel(new FlowLayout(FlowLayout.CENTER,5,5));
		ipTextField=new JTextField("127.0.0.1",8);
		remotePortTF=new JTextField(String.valueOf(DEFAULT_PORT),3);
		sendBT=new JButton("发送");
		clearBT=new JButton("清屏");
		//添加到底部面板
		bottomPanel.add(ipTextField);
		bottomPanel.add(remotePortTF);
		bottomPanel.add(sendBT);
		bottomPanel.add(clearBT);
		southPanel.add(new JScrollPane(inputTextArea),BorderLayout.CENTER);
		southPanel.add(bottomPanel,BorderLayout.SOUTH);
		//添加到窗体
		add(stateLB,BorderLayout.NORTH);
		add(new JScrollPane(centerTextArea),BorderLayout.CENTER);
		add(southPanel,BorderLayout.SOUTH);
		setVisible(true);
	}

  //2.编写事件处理器（发送信息）
  private void setListener()
  {

    sendBT.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				final String ipAddress=ipTextField.getText();
				final String remotePort=remotePortTF.getText();
				//判断IP地址和端口号是否为空
				if(ipAddress==null || ipAddress.trim().equals("") || remotePort==null || remotePort.trim().equals(""))
				{
					JOptionPane.showMessageDialog(GuiChat.this,"请输入IP地址和端口号");
					return;
				}
				if(datagramSocket==null || datagramSocket.isClosed())
				{
					JOptionPane.showMessageDialog(GuiChat.this,"监听不成功！");
					return;
				}

				//获取发送内容
				String sendContent=inputTextArea.getText();
				byte[] buf=sendContent.getBytes();
				try{
					//将发送的内容显示在自己的聊天记录中
					centerTextArea.append(" 我对 "+ipAddress+":"+remotePort+" 说：\n"+inputTextArea.getText()+"\n\n");
					centerTextArea.setCaretPosition(centerTextArea.getText().length());
					//发送数据
					datagramSocket.send(new DatagramPacket(buf,buf.length,InetAddress.getByName(ipAddress),Integer.parseInt(remotePort)));
					inputTextArea.setText("");
				
				}catch(IOException el)
				{
					JOptionPane.showMessageDialog(GuiChat.this,"出错了，发送不成功");
					el.printStackTrace();
				}

			}
			
   });

		clearBT.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				centerTextArea.setText("");//清除聊天记录的内容
			}
			
		});
	}
  
	//3.DategramSocket启动监听(接收信息)
   private void initSocket()
   {
		int port=DEFAULT_PORT;
		while(true){
			try{
				if(datagramSocket!=null && !datagramSocket.isClosed()){
					datagramSocket.close();
				}
				try{//判断端口号是否在1-65535之间
					port=Integer.parseInt(JOptionPane.showInputDialog(this,"请输入端口号","端口号",JOptionPane.QUESTION_MESSAGE));
					if(port<1 || port>65535){
						throw new RuntimeException("端口超出范围");
					}
					
				}catch(Exception e){
					JOptionPane.showMessageDialog(null,"你输入的端口号不正确，请输入1-65535之间的数");
					continue;
				}
				//启动DatagramSocket
				datagramSocket=new DatagramSocket(port);
				startListen();
				stateLB.setText("已在"+port+"端口监听");
				break;
			}catch(SocketException e){
				JOptionPane.showMessageDialog(this,"端口已被占用，请重新设置端口");
				stateLB.setText("当前还未启动监听");
			}
		}
   }
   
	public GuiChat()
	{
		 setUpUI();
		 initSocket();
		 setListener();
	}



   //startLisen()方法
   private void startListen()
   {
		new Thread(){
			private DatagramPacket p;
			public void run(){
				byte[] buf=new byte[1024];
				p=new DatagramPacket(buf,buf.length);
				while(!datagramSocket.isClosed()){
					try{
						datagramSocket.receive(p);//接收聊天信息
						//添加到聊天记录框
						centerTextArea.append(p.getAddress().getHostAddress()+" : "+((InetSocketAddress)p.getSocketAddress()).getPort()+" 对我说：\n "+new String(p.getData(),0,p.getLength())+"\n\n");
						//使滚动条自动滚动到最底端
						centerTextArea.setCaretPosition(centerTextArea.getText().length());
					}catch(IOException e){
						e.printStackTrace();
					}
				}
			}
		}.start();
   }
   
 
	public static void main(String[] args)
	{
		 new GuiChat();
	}


}


