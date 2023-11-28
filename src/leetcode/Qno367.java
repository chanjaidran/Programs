package leetcode;

public class Qno367 {

	public static void main(String[] args) {
		
	
		System.out.println(isPerfectSquare(100000001));
		System.out.println(isPerfectSquare(9));
		System.out.println(isPerfectSquareNormal(100000001));
		System.out.println(isPerfectSquareNormal(9));
		

	}
	public static boolean isPerfectSquare(int num) {
        
		 if(num<=1)
		 {
			 return true;
		 }
		 
		 long start=1;
		 long end=num;
		 
		 while(start<=end)
		 {
			 long mid=start+(end-start)/2;
			 long square=mid*mid;
			 if (square==num) {
				return true;
			}
			 
			 else if (square<num) {
				start=mid+1;
			}
			 else {
				end=mid-1;
			}
		 }
		 return false;
		 
	    }

public static boolean isPerfectSquareNormal(int num) {
        
	 boolean check = false;
	 if(num==1)
	 {
		 return true;
	 }
	 
	 for (long i = 1; i <num; i++) {
		
		 if (i*i==num) {
			 return true;
			 
			
		}
		
	}
	return check;
	 
    }

}
