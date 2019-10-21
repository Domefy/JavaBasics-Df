import java.util.Random; //随机数类
class Example616 
{
	public static void main(String[] args) 
	{
		Random r=new Random();
		for(int x=0;x<10;x++){
			System.out.println(r.nextInt(100));
		}
	}
}
