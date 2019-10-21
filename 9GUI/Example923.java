import java.awt.event.*;
import javax.swing.*;
public class Example923 extends JFrame//弹出式菜单
{
	private JPopupMenu popupMenu;
	public Example923(){
		popupMenu=new JPopupMenu();//菜单
		//创建三个 菜单项
		JMenuItem refreshItem=new JMenuItem("refresh");
		JMenuItem createItem=new JMenuItem("create");
		JMenuItem exitItem=new JMenuItem("exit");
		exitItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);	
			}
		
		});
		//往菜单添加菜单项
		popupMenu.add(refreshItem);
		popupMenu.add(createItem);
		popupMenu.addSeparator();
		popupMenu.add(exitItem);
		this.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				if(e.getButton()==e.BUTTON3){
					popupMenu.show(e.getComponent(),e.getX(),e.getY());
				}
			
			}
		});
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
}
	public static void main(String[] args)
	{
		new Example723();
	}
	
}