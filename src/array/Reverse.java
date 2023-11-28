package array;

import java.util.Arrays;

public class Reverse {

	public static void main(String[] args) {
		
		
		int arr[]= {1,2,3,4};
		rev(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
		
	}
	
	static void rev(int arr[],int s,int e) {
		while (s<e) {
			int temp=arr[s];
			arr[s]=arr[e];
			arr[e]=temp;
			s++;
			e--;
		}
		
		
		
	}
	
	
	static void reverse(int arr[])
	{
		for (int i = arr.length-1; i >=0; i--) {
			
			System.out.println(arr[i]);
		}
	}

}
