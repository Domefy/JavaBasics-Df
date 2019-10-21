  import java.util.*;
  public class Example712
  {
	  public static void main(String[] args){
		TreeSet tr=new TreeSet();   //平衡的排序二叉树 （小左（左子树<根）大右，去重复）
		tr.add("Jack");
		tr.add("Helena");
		tr.add("Helena");
		tr.add("Eve");
		Iterator it=tr.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	  }
  }

/*运行结果
Eve
Helena
Jac
*/