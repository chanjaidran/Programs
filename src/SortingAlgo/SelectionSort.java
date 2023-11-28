package SortingAlgo;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		
		int arr[]= {4,5,1,3,2};
		bubbleSort(arr);
		
		selectionSort(arr);
		String sort=Arrays.toString(arr);
		System.out.println(sort);
		

	}
	
	public static void selectionSort(int arr[])
	{
		for (int i = 0; i < arr.length; i++) {
			
			int last=arr.length-i-1;
			int maxIndex=getMaxIndex(arr, 0, last);
			swap(arr,maxIndex,last);
			
		}
	}
	
	public static void bubbleSort(int arr[])
	{
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if(arr[i]>arr[j])
				{
					swap(arr, i, j);
				}
			}
		}
	}
	
	private static void swap(int[] arr, int start, int last) {
		int temp=arr[start];
		arr[start]=arr[last];
		arr[last]=temp;
		
	}

	public static int getMaxIndex(int arr[],int start,int end)
	{
		int max=start;
		for (int i = start; i <= end; i++) {
			
			if (arr[i]>arr[max]) {
				max=i;
			}
		}
		return max;
		
	}

}
