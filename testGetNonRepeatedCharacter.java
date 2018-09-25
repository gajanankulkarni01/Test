import java.io.*;
import java.lang.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class testGetNonRepeatedCharacter {

	public static void main(String[] args){
		
		System.out.println("Please enter a String");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String c =getFirstNonRepeatedChar(str);
	
		if(c != null){
			System.out.println(c);
		}
	}

	private static String getFirstNonRepeatedChar(String str) {

		HashMap<Character, Integer> testMap = new HashMap<>();
		Character c;
		for(int i=0; i<str.length(); i++){
			c = str.charAt(i);
			if(testMap.containsKey(c)){
				testMap.put(c, testMap.get(c)+1);
			}
			else{
				testMap.put(c, 1);
			}
		}
		for(int i=0; i<str.length();i++){
			
			c = str.charAt(i);
			if(testMap.get(c)%2 == 0){
				return "String is Even";
			}
			
		}
		return "String is odd";
		
	}
	
}
