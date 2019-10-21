import java.util.Random;
class Example617 
{
	public static void main(String[] args) 
	{
		Random r=new Random(13); //创建对象时传入种子，导致第二次运行程序，产生的随机数还是原来的
		for(int x=0;x<10;x++){
			System.out.println(r.nextInt(100));
		}
		System.out.println("----------");
		Random r1=new Random();
		System.out.println("产生float类型随机数："+r1.nextFloat());
		System.out.println("产生0～100之间int类型随机数："+r1.nextInt(100));
		System.out.println("产生double类型的随机数："+r1.nextDouble());

	}
}
