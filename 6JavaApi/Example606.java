public class Example606
{
	public static void main(String[] args){
	  String str="羽毛球-篮球-兵乓球";
		System.out.println("从第5个字符截取到末尾的结果："+str.substring(4));
		System.out.println("从第5个字符截取到的第6个字符的结果："+str.substring(4,6));
		
		System.out.println("分割后的字符串数组中的元素依次为：");
		String[] strArray=str.split("-");       //可以按照 - 将字符串转换为字符串数组
		for(int i=0;i<strArray.length;i++){
			if(i!=strArray.length-1){
				System.out.print(strArray[i]+",");
			}else{
				System.out.println(strArray[i]);
			}
		}
	}
}