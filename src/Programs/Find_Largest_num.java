package Programs;

public class Find_Largest_num {
 public static void main(String args[]) {
	
	int []arra= {22,45,64,747,224,211};
	int max=arra[0];
	for(int num:arra) {
		if(num>max)
		max=num;
	}
	System.out.println(max);
}
}
