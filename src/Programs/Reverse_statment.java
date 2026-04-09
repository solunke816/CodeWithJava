package Programs;


public class Reverse_statment {
	public static void main(String args[]) {
		String str="My name is Yogesh";
		String []word=str.split(" ");
		for(int i=word.length-1;i>=0;i--) {
			System.out.print(word[i]+ " ");
		}
	
	}
}