import java.util.ArrayList;

public class SeparateStringAndNumber {
	
	public static void main(String[] args){
		
		String test = "a1s1d2f3g6h884t2r3ee";
		StringBuilder str = new StringBuilder();
		ArrayList<Integer> numList = new ArrayList<>();
		for(int i=0; i<test.length(); i++){
			Character c = test.charAt(i);
			if(c.isAlphabetic(test.charAt(i))){
				str.append(c);
			}
			else if(c.isDigit(test.charAt(i))){
				int testInt = c;
				System.out.println("testInt Value:"+testInt);
				Integer newInt = new Integer(c);
				numList.add(newInt);
			}
			
		}
		System.out.println("String Value:"+str);
		for(Integer num: numList){
		System.out.println("Number Value:"+num);
		}
		
	}

}
