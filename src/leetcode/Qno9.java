package leetcode;

public class Qno9 {

	public static void main(String[] args) {
		
		System.out.println(isPalindrome(121));

	}
	
	 public static boolean isPalindrome(int x) {
	        int temp=x;
	        int rev=0;
	      while(x!=0)
	    {
		      int v=x%10;
		      rev=(rev*10)+v;
		    x=x/10;
		
	     }
	      System.out.println(rev);

	if (temp==rev) {
		return true;
	}
	return false;     
	        
	    }

}
