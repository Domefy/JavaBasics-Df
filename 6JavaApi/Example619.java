public class Example619
{
	public static void main(String[] args){
		int a=20;
		Integer in=new Integer(a); //将整型a转化为Integer类型
		System.out.println(in.toString());
		Integer num=new Integer(20);
		int b=10;
		int sum=num.intValue()+b; //num.intValue()实现Integer类型转为int
		System.out.println("sum="+sum);
		
		int w=Integer.parseInt(args[0]);
		int h=Integer.parseInt(args[1]);
		for(int i=0;i<h;i++){
			StringBuffer sb=new StringBuffer();
			for(int j=0;j<w;j++){
				sb.append("*");
			}
			System.out.println(sb.toString());
		}
	}
}