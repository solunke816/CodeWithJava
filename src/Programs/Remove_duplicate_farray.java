package Programs;

import java.util.HashSet;

public class Remove_duplicate_farray {
  public static void main(String args[]) {
	  int [] array= {1,3,3,1,5,2};
	  HashSet<Integer>set=new HashSet<Integer>();
	  for(int n:array) {
		  set.add(n);
	  }
	  System.out.println(set);
  }
}
