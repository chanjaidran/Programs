package algorithm;

public class FindPivotRotatedSortedArray {

	public static void main(String[] args) {
		
		int arr[]= {4,5,6,2,3,4};
		System.out.println(findPivot(arr));
		//System.out.println(BinarySearch(arr, 4, 0, arr.length));
		System.out.println(search(arr, 2));

	}
	
	public static int search(int nums[],int target)
	{
		int start=0;
		int end=nums.length-1;
		
		int pivot=findPivot(nums);
		if (pivot==-1) {
			
			return BinarySearch(nums, target, start,end);
		}
		
		if(nums[pivot]==target)
		{
			return pivot;
		}
		
		if (target>nums[0]) {
			return BinarySearch(nums, target, start, pivot-1);
		}
		
			return BinarySearch(nums, target, pivot+1, end);
		
		
		
	}
	
	public static int BinarySearch(int arr[],int target,int start,int end)
	{
		
		
		while (start<=end) {
			int mid=start+(end-start)/2;
			
			if (target<arr[mid]) {
				end=mid-1;
			}
			else if (target>arr[mid]) {
				
				start=mid+1;
			}
			
			else {
				return mid;
			}
		}
		return -1;
	}
	
	public static int findPivot(int arr[])
	{
		int start =0;
		int end=arr.length-1;
		
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			
			if(mid<end && arr[mid]>arr[mid+1])
				{
					return mid;
				}
			if(mid>start && arr[mid]<arr[mid-1]) //{4,5,2,3,4};
			{
				return mid-1;
			}
			
			if(arr[mid]<=arr[start])
			{
				end=mid-1;
			}
			else {
				start=mid+1;
			}
			
		}
		return -1;
	}

}
