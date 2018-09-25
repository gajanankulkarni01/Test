
public class Test2 {
	
	int testMethod() throws Exception{
		int i;
		try{
			String s ="xyz";
			i = Integer.parseInt(s);
			System.out.println("In Try:"+i);
		}
		catch (NumberFormatException e) {
			i = 10;
			System.out.println("In Catch:" + i);
			throw new Exception();
		}
		finally{
			i = 20;
			System.out.println("In Finally:" + i);
			return i;
		}
		
	}
	
	public static void main(String args[]) throws Exception {
		Test2 test = new Test2();
		test.testMethod();
		
	}

}
