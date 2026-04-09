package Programs;

public class find_secoud_largest_nu{
	
	public static void main(String args[]) {
		
		int []arry= {23,34,21,43,-55,58};
		int largest=0;
		int secound=0;
		
		for(int num:arry) {
			if(num>largest) {     //23>0  true  sec=0 lar=23
				secound=largest;      
				largest=num;
			}
			else if(num>secound && num!=largest) {   //21>34 false se=21
				secound=num;
			}
		}System.out.print(secound);
	}
}