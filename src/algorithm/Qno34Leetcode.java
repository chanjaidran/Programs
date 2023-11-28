package algorithm;

public class Qno34Leetcode {

	public static void main(String[] args) 
	{
		int nums[] = {5,7,7,8,10};
		int target=7;
		
	int a[]=	bSearch(nums,target);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		

	}
	
	public static int[] bSearch(int nums[],int target) {
		
		int arr[]= {-1,-1};
		
		arr[0]=find(nums, target, true);
		arr[1]=find(nums, target, false);
		
		
		return arr;
	}
	
	public static int find(int arr[],int target,boolean index)
	{
		int ans=-1;
		int start=0;
		int end=arr.length-1;
		
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			
			if (target<arr[mid]) {
				end=mid-1;
			}
			else if (target>arr[mid]) {
				start=mid+1;
			}
			else {
				ans=mid;
				if(index)
				{
					end=mid-1;
				}
				else {
					start=mid+1;
				}
			}
		}
		return ans;
	}

}
