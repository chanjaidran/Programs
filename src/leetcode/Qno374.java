package leetcode;

public class Qno374 {

	public static void main(String[] args) {
		
		

	}
	
	public static int guessNumber(int n) 
    {
        int start=1;
        int end=n;
      
        while(start<=end)
        {
        	int mid=start+(end-start)/2;
        	  int Gn=guessNumber(mid);
        		        
        	  if (Gn==-1) {
				end=mid-1;
			}
        	  else if(Gn==1){
				start=mid+1;
			}
        	  else {
				return mid;
			}
        	
        }
		return 0;
    }

}
