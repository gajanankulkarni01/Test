class ABC{
	static int x;
	static int y;
	void add(int a,int b){
		x = a + b;
		y = x + b;
	}
}
public class Test1 {
	public static void main(String args[]){
		ABC obj1 = new ABC();
		ABC obj2 = new ABC();
		int a = 2;
		obj1.add(a, a+1);
		obj2.add(5, a);
		System.out.println(obj1.x + "\t" + obj2.y);
	}
	
}

