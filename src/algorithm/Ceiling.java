package algorithm;

public class Ceiling {

	public static void main(String[] args) {
		
		int arr[]= {2,3,4,5,7,8,14,16,19};
		System.out.println(Ceiling(arr, 15));
		System.out.println(Floor(arr, 15));

		
		
	}

	
	public static int Ceiling(int arr[],int target)
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
		return start;
	}
	
	public static int Floor(int arr[],int target)
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
		return end;
	}
}
