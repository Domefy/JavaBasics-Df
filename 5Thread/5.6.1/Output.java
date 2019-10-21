class Output implements Runnable //取出类
{
	private Storage st;
	Output(Storage st){
		this.st=st;
	}
	public void run(){
		while(true){
			st.get();
		}
	}
}
