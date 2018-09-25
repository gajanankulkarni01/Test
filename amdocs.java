
public class amdocs {

	private amdocs(int a){
		
	}
	public static void main(String[] args) throws Exception{

		Class cls = Class.forName("admocs");
		amdocs a = (amdocs)cls.newInstance();
		System.out.println(a.getClass().getName());
	}
}
