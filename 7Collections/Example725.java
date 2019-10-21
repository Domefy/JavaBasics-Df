/*
class CachePool
{
	Object temp;
	public void save(Object temp){ //用于保存数据
		this.temp=temp;
	}
	public Object get(){     //用于取出数据
		return temp;
	}
}
public class Example25
{
	public static void main(String[] args){
		CachePool pool=new CachePool();  //创建 CachePool对象
		pool.save(new Integer(1));     //存入数据
		String temp=pool.get();				//取出数据
		System.out.println(temp);
	}
}
*/
/*解决办法*/
class CachePool<T>
{
	T temp;
	public void save(T temp){ //用于保存数据
		this.temp=temp;
	}
	public T get(){     //用于取出数据
		return temp;
	}
}
public class Example725
{
	public static void main(String[] args){
		CachePool<Integer> pool=new CachePool<Integer>();  //创建 CachePool对象 指定类型为 Integer类型
		pool.save(new Integer(1));     //存入数据
		Integer temp=pool.get();				//取出数据
		System.out.println(temp);
	}
}


/*
Example25.java:16: error: incompatible types: Object cannot be converted to String
                String temp=pool.get();                 //取出数据
                                    ^
1 error
*/