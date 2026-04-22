package Programs;

import java.util.Arrays;

public class Check_anagram {
	public static void main(String []args) {
		String s1="Listen";
		String s2="Silent";
	
		char[]a1=s1.toLowerCase().toCharArray();
		char[]a2=s2.toLowerCase().toCharArray();
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		if(Arrays.equals(a1, a2)) {
			System.out.println("String is anagram");
		}else
			System.out.println("No anagra");
				
	}

}
