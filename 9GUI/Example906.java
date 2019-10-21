//9.3.2鼠标事件
import java.awt.*;
import java.awt.event.*;
public class Example906
{
	public static void main(String[] args){
		final Frame f=new Frame("WindowEvent");
		f.setLayout(new FlowLayout());     //没有这句的话，会出现按钮填满整个窗体的情况
		f.setSize(300,200);
		f.setLocation(300,200);
		f.setVisible(true);
		Button btn=new Button("BUtton");
		f.add(btn);
		btn.addMouseListener(new MouseListener(){
			public void mouseReleased(MouseEvent e){
				System.out.println("mouseReleased-鼠标放开事件");
			}
			public void mousePressed(MouseEvent e){
				System.out.println("mousePressed-鼠标按下事件");
			}
			public void mouseExited(MouseEvent e){
				System.out.println("mouseExited-鼠标溢出按钮区域事件");
			}
			public void mouseEntered(MouseEvent e){
				System.out.println("mouseEntered-鼠标进入按钮区域事件");
			}
			public void mouseClicked(MouseEvent e){
				System.out.println("mouseClicked-鼠标完成点击事件");
				if(e.getButton()==e.BUTTON1){
					System.out.println("鼠标左击事件");
				}else if(e.getButton()==e.BUTTON3){
					System.out.println("鼠标右击事件");
				}else if(e.getButton()==e.BUTTON2){
					System.out.println("鼠标中键点击事件");
				}
			}
		});
	}
}