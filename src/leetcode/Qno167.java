package leetcode;

public class Qno167 {

	public static void main(String[] args) {
		
		int arr[]= {2,7,11,15};
		int a[]=	twoSum(arr,13);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		

	}
public static  int[] twoSum(int[] numbers, int target) {
	
	int start=0;
	int end=numbers.length-1;
	
	while(start<end)
	{
		
		
		if(numbers[start]+numbers[end]>target)
		{
			
			end--;
		}
		else if(numbers[start]+numbers[end]<target)
		{
			
			start++;
		}
		else {
			return new int[] {start+1,end+1};
		}
		
		
	}
	
	
	return new int[] {start+1,end+1};
    }


}
