
public class MissingNumber
{

	public static void main(String[] args) 
	{
		
		int array[]= {1,3,4,5,6};
		int n=6;
		
		int sum=0;
	       for(int i=1;i<=n;i++)
	       {
	           sum=sum+i;
	       }
	       
	       System.out.println(sum);
	       
	       int arrsum=0;
	       for(int i=0;i<array.length;i++)
	       {
	           arrsum=arrsum+array[i];
	           
	       }
	       
	       System.out.println(arrsum);
	       
	       int max=Math.max(sum, arrsum);
	       int min=Math.min(sum, arrsum);
	       System.out.println(max-min);
	       
	     
	    }
	}

