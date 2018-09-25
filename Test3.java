class MyThread extends Thread{
	MyThread(){
		System.out.println("MyThread");
	}
	public void run(){
		System.out.println("WAR");
	}
	public void run(String s){
		System.out.println("BAR");
	}
}

public class Test3  {
	public static void main(String[] args) {
		Thread t = new MyThread(){
			public void run() {
			}
		};
		t.start();
		
		
	}

}
