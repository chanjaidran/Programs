package algorithm;

public class BinarySearch {

	public static void main(String[] args) {
		
		

		int arr2[]= {90,89,45,34,21,8,5,1};
		System.out.println(OrderAgonosticBinarySearch(arr2, 34));

	}
	

	
	public static int OrderAgonosticBinarySearch(int arr[],int target)
	{
		int start=0;
		int end=arr.length-1;
		
		boolean isAsc=arr[start]<arr[end];
		
		
		while (start<=end) {
			int mid=start+(end-start)/2;
			if (target==arr[mid]) {
				return mid;
			}
			
			if (isAsc) {
				if (target<arr[mid]) {
					end=mid-1;
				}
				else  {
					
					start=mid+1;
				}
				
			}
			
			else {
				if (target<arr[mid]) {
					start=mid+1;;
				}
				else {
					
				   end=mid-1;
				}
				
			}
			
			
			
			
			
			
		}
		return -1;
	}
	public static int BinarySearch(int arr[],int target)
	{
		int start=0;
		int end=arr.length-1;
		
		
		
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
}
