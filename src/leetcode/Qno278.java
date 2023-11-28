package leetcode;

public class Qno278 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int firstBadVersion(int n) {
        int start=1;
        int end=n;
      
        while(start<=end)
        {
        	int mid=start+(end-start)/2;
        	  
              if(isBadVersion(mid)==false)
              {
                  start=mid+1;
              }
              else if(isBadVersion(mid)==true)
              {
                  end=mid-1;
              }

              else{
                  return mid;
              }
        		        
        	
        	
        }
        return start;
    }

	private static boolean isBadVersion(int mid) {
		// TODO Auto-generated method stub
		return false;
	}

}
