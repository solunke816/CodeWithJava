package Programs;

public class Reverse_string {
	public static void main(String args []) {
		
		String str="Automation";
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--) {
			rev+=str.charAt(i);
		}
		System.out.println("Reverse string is : " +rev);
	}
	

}
