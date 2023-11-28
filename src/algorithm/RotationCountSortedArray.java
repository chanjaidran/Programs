package algorithm;

public class RotationCountSortedArray {

	public static void main(String[] args) {
		
		int arr[]= {4,5,1,2,3};
		System.out.println(findPivot(arr));
		System.out.println(rotateCount(arr));

	}
	
	
	public static int rotateCount(int arr[])
	{
		int count=findPivot(arr);
		if (count==-1) {
			return -1;
		}
		
		return count+1;
	}
	
	public static int findPivot(int arr[])
	{
		
		int start=0;
		int end=arr.length-1;
		
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			
			if (mid<end && arr[mid]>arr[mid+1]) {
				return mid;
			}
			
			if (mid>start && arr[mid]<arr[mid-1]) {
				
				return mid-1;
			}
			
			if (arr[start]>=arr[mid]) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
			
			
		}
		return -1;
		
	}

}
