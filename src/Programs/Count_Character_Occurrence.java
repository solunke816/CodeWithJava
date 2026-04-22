package Programs;
import java.util.*;
public class Count_Character_Occurrence {
	public static void main(String[]args) {
		String str="Automatin";
		Map<Character,Integer>CharCount=new LinkedHashMap<>();
		for(char ch:str.toCharArray()) {
			CharCount.put(ch, CharCount.getOrDefault(ch,0)+1);
		}
		System.out.println(CharCount);
	}

}
