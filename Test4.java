
public class Test4 {

	public static void main(String[] args) {

		String s1 = "abc";
		String s2 = s1;
		s1 += "d";
		System.out.println(s1+"\t"+s2+"\t"+ (s1==s2));
		
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = sb1;
		sb1.append("d");
		System.out.println(sb1+"\t"+sb2+"\t"+(sb1==sb2));
	}

}
