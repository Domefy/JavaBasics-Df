class Input implements Runnable
{
	private Storage st; //类实例化
	private int num;    //存入的数据
	Input(Storage st){  //初始化构造方法
		this.st=st;
	}
	public void run(){
		while(true){
			st.put(num++); //将num存入数组，存入后自增
		}
	}
}