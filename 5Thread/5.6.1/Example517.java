public class Example517 {
	public static void main(String[] args) {
		Storage st = new Storage(); // 实例化对象
		Input input = new Input(st);
		Output output = new Output(st);
		new Thread(input).start(); // 开启两个线程
		new Thread(output).start();
	}
}