import java.awt.*;
import java.awt.event.*;
import java.util.Random;
public class Example914
{
	public static void main(String[] args)
	{
			final Frame  frame=new Frame("验证码");
			final Panel panel=new MyPanel();
			frame.add(panel);
			frame.setSize(200,100);
			frame.setLocationRelativeTo(null); //将Frame窗口居中
			frame.setVisible(true);
		
	}
}
class MyPanel extends Panel
{
		 public void paint(Graphics g)
		 {
			int width=160; //验证码图片的宽度
			int height=40;
			g.setColor(Color.LIGHT_GRAY); //设置上下文颜色
			g.fillRect(0,0,width,height); //填充验证码背景
			g.setColor(Color.BLACK);     //设置上下文颜色
			g.drawRect(0,0,width-1,height-1); //绘制边框
			//绘制干扰点
			Random r=new Random();
			for(int i=0;i<100;i++)
			{
				int x=r.nextInt(width)-2;
				int y=r.nextInt(height)-2;
				g.drawOval(x,y,2,2);
			}
			g.setFont(new Font("宋体",Font.BOLD,30));//设置验证码字体
			g.setColor(Color.BLUE);//设置验证码颜色
			//产生随机验证码
			char[] chars=("0123456789abcdefghijkmnopqrstuvwxyzABCDEFG"+"HIJKLMNPQSTUVWXYZ").toCharArray();
			StringBuilder sb=new StringBuilder();
			for(int i=0;i<4;i++)
			{
				int pos=r.nextInt(chars.length);
				char c=chars[pos];
				sb.append(c+" ");
			}
			g.drawString(sb.toString(),20,30);//写入验证码

		}
		
}

