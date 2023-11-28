package leetcode;

import java.util.Arrays;

import org.omg.CORBA.INTERNAL;

public class Qno1652 {

	public static void main(String[] args) 
	{
		
		int[][] arr=new int[][]
			{
				
				{1,2,3},
				{1,2,4}
			};
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}
		
		for(int[] a:arr)
		{
			System.out.println(Arrays.toString(a));
		}
		
		
		System.out.println(count(arr));
	}
		
	

	
	static int count(int[][] arr)
	{
	
		int max=Integer.MIN_VALUE;
		
	for (int i = 0; i < arr.length; i++) {
			    int sum=0;
			for (int j = 0; j < arr[i].length; j++) {
				
				sum=sum+arr[i][j];
			}
	
			if (sum>max) {
				max=sum;
			}
		}
		return max;
	}
}
