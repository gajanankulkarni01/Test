
import java.util.HashMap;
import java.util.Scanner;

public class StringEvenOdd {
	public static void main(String[] args) {
		String line;
		int value;
		boolean isOdd = false;
		Scanner sc = new Scanner(System.in);
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		System.out.println("Enter a String :");
		line = sc.nextLine();
		for (int i = 0; i < line.length(); i++) {
			if (map.containsKey(line.charAt(i))) {
				value = map.get(line.charAt(i));
				value++;
				map.put(line.charAt(i), value);
			} else {
				map.put(line.charAt(i), 1);
			}
		}

		for (Character key : map.keySet()) {
				if(map.get(key)%2 == 1){
					isOdd = true;		
					}
				
		}
		if(isOdd == true){
			System.out.println("String is Odd");
		}
		else{
			System.out.println("String is Even");

		}
	}
}
