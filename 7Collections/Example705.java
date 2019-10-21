public class Example705
{
	static String[] strs={"aa","bb","cc","dd"};
	public static void main(String[] args){
		//foreach改不了数组中的数值
		for(String str : strs){
			str="ee";
		}
		System.out.println("foreach改过后"+strs[0]+strs[1]+strs[2]+strs[3]);
		
		//for索引
		for(int i=0;i<strs.length;i++){
			strs[i]="ee";
		}
		System.out.println("for索引改过后"+strs[0]+strs[1]+strs[2]+strs[3]);

	}
}