package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class Qno852 {

	public static void main(String[] args)
	{
			int arr[]= {0,10,11,5,2};
			
	
System.out.println(findMaxBinarySearch(arr));

	}
	
	public static int findMaxBinarySearch(int arr[])
	{
		int start=0;
		int end=arr.length-1;
		while(start<end)
		{
			int mid=start+(end-start)/2;
			
 			if (arr[mid]>arr[mid+1]) {
				end=mid;
			}
			else 
				start=mid+1;
			
			
		}
		return start;
	}
	
	public static int findMax(int arr[])
	{
		int max=Integer.MIN_VALUE;
		List<Integer> list=new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			
		  list.add(arr[i]);
		}

		for(Integer integer :list)
		{
			if (integer>max) {
				max=integer;
			}
		}
		
		
		return list.indexOf(max);
		}
		
}
