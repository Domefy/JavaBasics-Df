/*
class  Storage //该方法存在问题，就是线程调用的时候会出现读入的和取出的数据不一致
{
	//数据存储数组
	private int[] cells=new int[10];
	//inPos:表示存入时数组下标 outPos:表示取出时数组下标
	private int inPos,outPos;
	public void put(int num){//num表示存入的数据
		cells[inPos]=num;
		System.out.println("在cell是["+inPos+"]中放入数据----"+cells[inPos]);
		inPos++;
		if(inPos==cells.length){
			inPos=0;
		}
	}
	public void get(){
		int data=cells[outPos];
		System.out.println("在cell是["+outPos+"]中放入数据----"+cells[outPos]);
		outPos++;
		if(outPos==cells.length){
			outPos=0;
		}
	}
}
*/
//用this.wait() 和 this.notify() 控制多个线程按照一定的顺序轮流执行
class Storage
{
	private int[] cells=new int[10];
	private int inPos,outPos;
	private int count;
	public synchronized void put(int num){     //this.wait() 和 this.notify() 还有this.notifyAll() 调用者必须为 同步锁对象 synchronized
		try{
			while(count==cells.length){
				this.wait();     //存入的数据等于cells数组的长度，此线程等待
			}
			cells[inPos]=num;
			System.out.println("在cell是["+inPos+"]中放入数据----"+cells[inPos]);
			inPos++;
			if(inPos==cells.length){
				inPos=0;
			}
			count++;
			this.notify();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public synchronized void get(){
		try{
			while(count==0){  //如果取出的数量为0时，此线程等待
				this.wait();
			}
			int data=cells[outPos];
			System.out.println("在cell是["+outPos+"]中放入数据----"+cells[outPos]);
			cells[outPos]=0;         //取出后，当前位置的数据置为0
			outPos++;
			if(outPos==cells.length){
				outPos=0;
			}
			count--;
			this.notify();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}