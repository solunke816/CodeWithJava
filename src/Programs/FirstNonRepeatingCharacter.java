package Programs;

import java.util.LinkedHashMap;
import java.util.Map;

// Write a Java program to find the first non-repeating character in a given string. 
// Input: "programming" 
// Output: 'p' java code


public class FirstNonRepeatingCharacter {
	
  public static void main(String []args) 
  { 
	  String input="programming"; 
	  Character result=findFirstNonRepeating(input);
	  
	  if(result!=null) {
		  System.out.println("First non-Repeting Charater is  "+ result);
	  }
	  else {
		  System.out.println("No non-repeating character found.");
	  }
  }  
  
  public static Character findFirstNonRepeating(String str){
	  
	  Map<Character,Integer>CharCount=new LinkedHashMap<>();
	  
	  // Count occurrences of each character
	  for(char ch:str.toCharArray()) {
		CharCount.put(ch,CharCount.getOrDefault(ch, 0)+1); 
	  }
	
	  // Find first character with count 1
	  for(Map.Entry<Character, Integer>entry:CharCount.entrySet()) {
		  if(entry.getValue()==1)
			  return entry.getKey();
	  }

	return null;
  }

}
